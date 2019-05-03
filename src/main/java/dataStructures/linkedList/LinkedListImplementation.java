package dataStructures.linkedList;

public class LinkedListImplementation {

    public static void main(String[] args) {
        ListNode2 l1 = new ListNode2();
        ListNode2 l2 = new ListNode2();
        ListNode2 l3 = new ListNode2();

        l1.item = 7;
        l2.item = 0;
        l3.item = 6;

        l1.next = l2;
        l2.next = l3;
        l3.next = null;
    }

}



