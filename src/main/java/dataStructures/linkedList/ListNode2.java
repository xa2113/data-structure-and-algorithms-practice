package dataStructures.linkedList;

public class ListNode2 {

    Object item;
    ListNode2 next;


    ListNode2() {
    }

    public ListNode2(Object item, ListNode2 next) {
        this.item = item;
        this.next = next;
    }

    //insert a new item after "this"
    public void insertAfter(Object item) {
        next = new ListNode2(item, next);
    }

    //pseudocode: to insert 100 items -> do it in reverse(forward) order
    public void insertForward(int item) {
        ListNode2 l4 = new ListNode2();
        for (int i = 0; i < 100; i++) {
            l4.insertAfter(item);
            l4 = l4.next;
        }
    }

    public ListNode2 findNth(int position) {
        //note: not numbering from 0
        if (position == 1) {
            return this;
            //error checking: either position lower than 1, next is null (we already at last position in the list)
        } else if (position < 1 || next == null) {
            return null;
        } else {
            //recursive method -> if you need 4th item, you move one position forward, what you are looking for now becomes 3rd. (imagine pointers)
            return next.findNth(position - 1);
        }
    }

}