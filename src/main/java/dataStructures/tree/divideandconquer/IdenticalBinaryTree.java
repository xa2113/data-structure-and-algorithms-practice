package dataStructures.tree.divideandconquer;

import dataStructures.tree.dfs.recursionproblems.TreeNode;

public class IdenticalBinaryTree {

    public boolean isIdentical(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return true;
        } else if (a == null || b == null){
            return false;
        }

        if (a.val != b.val){ //check if root is the same
            return false;
        }
        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }
}
