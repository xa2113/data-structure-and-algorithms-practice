package dataStructures.stack;

import java.util.NoSuchElementException;

//implementation of stack using LinkedList
public class MyStack {

    private ListNode head;

    public void push(int value){
        ListNode newHead = new ListNode(value);
        newHead.next = head;
        head = newHead;
    }

    public int pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        int poppedElement = head.val;
        head = head.next;
        return poppedElement;
    }

    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return head.val;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear(){
        head = null;
    }

}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}