package dataStructures.queue;

import java.util.NoSuchElementException;

public class MyQueue {

    private ListNode head;
    //to make any operations to tail of list also O(1), we save a listNode of tail
    private ListNode tail;

    public void offer(int val){
        //if the queue is empty
        if(tail == null){
            head = tail = new ListNode(val);
        } else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
    }

    public int poll(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int poppedElement = head.val;
        head = head.next;

        if(head == null){
            tail = null; //when there is no more element to pop, manually update tail to null
        }
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
        head = tail = null;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}