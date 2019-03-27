package dataStructures.linkedList;

public class SinglyLinkedList {

    private ListNode head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    //insert an item
    public void insertFront(Object item) {
        head = new ListNode(item, head);
        size++;
    }

    //deleting an item
    public void deleteFront() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    //insert or deleting at end of list

}
