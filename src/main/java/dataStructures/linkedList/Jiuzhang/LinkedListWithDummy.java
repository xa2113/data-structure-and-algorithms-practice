package dataStructures.linkedList.Jiuzhang;

import java.util.List;

public class LinkedListWithDummy {
    private ListNode dummy = new ListNode(-1); //val is not used, so -1

    //create/insert 增(插入）
    public void add(int location, int value){
        ListNode pre = dummy;
        for(int i = 0; i < location; ++i){
            pre = pre.next;
        }

        ListNode newNode = new ListNode(value);
        newNode.next = pre.next;
        pre.next = newNode;
    }


    //read 查
    public int get(int location){
        ListNode cursor = dummy.next;
        for(int i = 0; i < location; ++i){
            cursor = cursor.next;
        }
        return cursor.val;
    }

    //update 改
    public void set(int location, int newValue){
        ListNode cursor = dummy.next;
        for(int i = 0; i < location; ++i){
            cursor = cursor.next;
        }
        cursor.val = newValue;
    }

    //delete 删
    public int delete(int location){
        ListNode deletedNode = null;

        ListNode pre = dummy;
        for(int i = 0; i < location; ++i){
            pre = pre.next;
        }
        deletedNode = pre.next;
        pre.next = pre.next.next;

        return deletedNode.val;
    }
}
