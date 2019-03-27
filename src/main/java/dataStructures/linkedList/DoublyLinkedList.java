package dataStructures.linkedList;

public class DoublyLinkedList {

    private DListNode head;
    private DListNode tail;

    private class DListNode {
        Object item;
        DListNode next;
        DListNode prev;

        public DListNode(Object item, DListNode next, DListNode prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    //insert and delete items at both ends in constant running time
    //remove the tail node if at least 2 items in DList
    public void removeTailNode(){
        tail.prev.next = null;
        tail = tail.prev;
    }
}
