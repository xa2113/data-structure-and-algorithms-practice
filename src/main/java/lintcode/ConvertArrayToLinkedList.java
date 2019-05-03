package lintcode;


import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToLinkedList {
    public List<Integer> toArrayList(ListNode head) {
        // write your code here
        List<Integer> resultList = new ArrayList<>();
        while (head != null) {
            resultList.add(head.val);
            head = head.next;
        }
        return resultList;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


