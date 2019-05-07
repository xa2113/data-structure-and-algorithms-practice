package dataStructures.tree.bfs.problems;

import dataStructures.tree.dfs.recursionproblems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();

        if (root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode cur = queue.poll();
                temp.add(cur.val);

                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            res.add(temp);
        }
        return res;
    }

}
