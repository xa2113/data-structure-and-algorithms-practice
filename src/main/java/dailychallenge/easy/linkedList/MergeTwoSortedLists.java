package dailychallenge.easy.linkedList;
//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

import java.util.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);

            LinkedList<Integer> l2 = new LinkedList<>();
            l2.add(1);
            l2.add(3);
            l2.add(4);

        System.out.println(mergeTwoLists(l1, l2));


    }

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList newList = new LinkedList<>();
        while (l1.peek() != null || l2.peek() != null) {
            if (l1.peek() < l2.peek() || l1.peek() == l2.peek()) {
                newList.add(l1.poll());
            } else {
                newList.add(l2.pop());
            }
        }
        return newList;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
