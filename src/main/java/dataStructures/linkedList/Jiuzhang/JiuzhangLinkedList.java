package dataStructures.linkedList.Jiuzhang;

public class JiuzhangLinkedList {
    private ListNode head;

    //create/insert 增(插入）
    public void add(int location, int value){

        // inserting to the middle of linkedList
        if(location > 0) {
            //pre is the node before where we insert
            ListNode pre = head;
            for (int i = 0; i < location - 1; i++) {
                pre = pre.next;
            }

            ListNode newNode = new ListNode(value);
            newNode.next = pre.next;
            pre.next = newNode;
        } else {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode; //newNode becomes the new head!
        }
    }


    //read 查
    public int get(int location){
        ListNode cursor = head;
        for(int i = 0; i < location; ++i){
            cursor = cursor.next;
        }
        return cursor.val;
    }

    //update 改
    public void set(int location, int newValue){
        ListNode cursor = head;
        for(int i = 0; i < location; ++i){
            cursor = cursor.next;
        }
        cursor.val = newValue;
    }

    //delete 删
    public int delete(int location){
        ListNode deletedNode = null;

        if(location > 0){
            ListNode pre = head;
            for(int i = 0; i < location -1; ++i){
                pre = pre.next;
            }
            deletedNode = pre.next;
            pre.next = pre.next.next;
        } else if(location == 0){
            deletedNode = head;
            head = head.next;
        }
        return deletedNode.val;
    }
}
