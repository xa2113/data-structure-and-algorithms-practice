package leetcode.easy.linkedList;
//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

import java.util.LinkedList;

public class MergeTwoSortedLists_2 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);

            LinkedList<Integer> l2 = new LinkedList<>();
            l2.add(1);
            l2.add(3);
            l2.add(4);




    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
