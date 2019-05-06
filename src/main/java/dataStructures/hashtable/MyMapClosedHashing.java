package dataStructures.hashtable;

public class MyMapClosedHashing {

    private Pair[] data = null;
    private int capacity = 0;
    //missing rehashing functionality

    public MyMapClosedHashing() {
        capacity = 16;
        data = new Pair[capacity];
    }

    public MyMapClosedHashing(int capacity) {
        this.capacity = capacity;
        data = new Pair[capacity];
    }

    public void put(String key, String val){
        if (key == null) return;

        int index = key.hashCode() % capacity;
        for(int i = 0; i < capacity; ++i){
            int cur = (index + i) % capacity;
            if(data[cur] == null){
                data[cur] = new Pair(key, val);
                return;
            } else if (data[cur].key.equals(key)) {
                data[cur].val = val;
                return;
            }
        }
        throw new IllegalStateException("HashMap is already full -> need to add function to rehash...");
    }

    public String get(String key){
        if (key == null){
            return null;
        }

        int index = key.hashCode() % capacity;
        for(int i = 0; i < capacity; ++i){
            int cur = (index + i) % capacity;
            if(data[cur] == null){
                return null;
            } else if (data[cur].key.equals(key)){
                return data[cur].val;
            }
        }
        return null;
    }
}
