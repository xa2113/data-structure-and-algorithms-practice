package dataStructures.hashtable;

public class MyMapOpenHashing {

    private MapListNode[] data;
    private int capacity;
    private int size;
    private static final float LOAD_FACTOR = 0.75f; //can also use 0.5 or anything else

    public MyMapOpenHashing() {
        capacity = 16;
        size = 0;
        data = new MapListNode[capacity];
    }

    public MyMapOpenHashing(int capacity) {
        this.capacity = capacity;
        size = 0;
        data = new MapListNode[capacity];
    }

    public void put(String key, String val){
        if(key == null) return; //if user doesn't put in key, then nothing happens

        if(size >= capacity % LOAD_FACTOR){
            doubleSizeAndRehash();
        }

        int index = key.hashCode() % capacity; //gives you a number between 0 - capacity -1
        MapListNode cur = data[index]; //cur should be head of a linkedlist. null if nothing is in the linkedlist
        while (cur != null){
            if (cur.pair.key.equals(key)){ //find if there is a key in the linkedlist that is equal to key in parameter, then update val
                cur.pair.val = val;
                return;
            }
            cur = cur.next;
        }

        //otherwise, the key doesn't exist yet, so we put in a new key-value pair
        MapListNode newNode = new MapListNode(new Pair(key, val));
        newNode.next = data[index]; //set current head of linkedlist to the next item in linkedlist
        data[index] = newNode;
        size++;

    }

    public String get(String key){
        if(key == null){
            return null;
        }

        int index = key.hashCode() % capacity;
        MapListNode cur = data[index];
        while (cur != null){
            if(cur.pair.key.equals(key)){
                return cur.pair.val;
            }
            cur = cur.next;
        }
        return null;
    }

    private void doubleSizeAndRehash() {
        int newCapacity = capacity * 2;
        MapListNode[] newData = new MapListNode[newCapacity];

        for(int i = 0; i < capacity; ++i){ //put all the existing items into new hashtable
            MapListNode cur = data[i];
            while(cur != null){
                MapListNode tmp = cur;
                cur = cur.next;

                int newIndex = tmp.pair.key.hashCode() % newCapacity;
                tmp.next = newData[newIndex];
                newData[newIndex] = tmp;
            }
        }
        capacity = newCapacity;
        data = newData;
    }

}


class MapListNode {
    Pair pair;
    MapListNode next;

    public MapListNode(Pair pair) {
        this.pair = pair;
        next = null;
    }
}