package dataStructures.tree.bfs.problems;

import dataStructures.linkedList.Jiuzhang.ListNode;
import dataStructures.tree.dfs.recursionproblems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConvertBinaryTreeToLinkedListByDepth {

    public List<ListNode> binaryTreeToLists(TreeNode root){
        List<ListNode> res = new ArrayList<>(); //返回一个arraylist里面装了很多linkedlist的头节点

        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            ListNode dummy = new ListNode(-1); //dummy是链表中最前面的元素
            ListNode tmp = dummy; //tmp指向链表中最后的一个元素

            for(int i = 0; i < n; ++i){
                TreeNode cur = queue.poll();
                tmp.next = new ListNode(cur.val);
                tmp = tmp.next;
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            res.add(dummy.next); //dummy是这一层链表头节点的前面那个节点
        }
        return res;
    }
}
