package dataStructures.tree.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraverse {

    public static void main(String[] args) {
        TreeNode root = buildTree();
        breadthFirstTraverse(root);
        System.out.println();
        breadthFirstTraverseByLevel(root);
    }


    public static void breadthFirstTraverse(TreeNode root){
        if (root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); //root进入队列

        while (!queue.isEmpty()){
            TreeNode cur = queue.poll(); //把root存到cur里，并poll out of queue
            System.out.print(cur.val + " "); //print root
            if (cur.left != null) {
                queue.offer(cur.left); //把左孩子放进queue
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    public static void breadthFirstTraverseByLevel(TreeNode root){
        if (root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int n = queue.size();
            for(int i = 0; i < n; ++i){
                TreeNode cur = queue.poll();
                System.out.print(cur.val + " ");

                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            System.out.println();
        }
    }

    public static TreeNode buildTree() {
        TreeNode node1 = new TreeNode(8);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(14);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(7);
        TreeNode node9 = new TreeNode(13);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.right = node6;

        node5.left = node7;
        node5.right = node8;

        node6.left = node9;

        return node1;
    }

}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}