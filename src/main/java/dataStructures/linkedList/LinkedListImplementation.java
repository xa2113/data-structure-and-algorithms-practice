package dataStructures.linkedList;

public class LinkedListImplementation {

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();

        l1.item = 7;
        l2.item = 0;
        l3.item = 6;

        l1.next = l2;
        l2.next = l3;
        l3.next = null;
    }

}

class ListNode {

    Object item;
    ListNode next;


    ListNode() {
    }

    public ListNode(Object item, ListNode next) {
        this.item = item;
        this.next = next;
    }

    //insert a new item after "this"
    public void insertAfter(Object item) {
        next = new ListNode(item, next);
    }

    //pseudocode: to insert 100 items -> do it in reverse(forward) order
    public void insertForward(int item){
        ListNode l4 = new ListNode();
        for(int i = 0; i < 100; i++){
            l4.insertAfter(item);
            l4 = l4.next;
        }
    }

    public ListNode findNth(int position){
        //note: not numbering from 0
        if(position == 1){
            return this;
            //error checking: either position lower than 1, next is null (we already at last position in the list)
        } else if (position < 1 || next == null){
            return null;
        } else {
            //recursive method -> if you need 4th item, you move one position forward, what you are looking for now becomes 3rd. (imagine pointers)
            return next.findNth(position -1);
        }
    }


}