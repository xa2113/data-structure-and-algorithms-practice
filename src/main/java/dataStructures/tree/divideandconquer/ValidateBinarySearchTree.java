package dataStructures.tree.divideandconquer;

import dataStructures.tree.dfs.recursionproblems.TreeNode;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root){
        return checker(root, Long.MIN_VALUE, Long.MAX_VALUE); //Changed Integer to Long so that if root is Integer.Min or Integer.Max, it is still within our range
    }

    private boolean checker(TreeNode root, long minVal, long maxVal){
        if (root == null){
            return true;
        }

        if(root.val <= minVal || root.val >= maxVal){
            return false;
        }

        return checker(root.left, minVal, root.val) && checker(root.right, root.val, maxVal);
    }
}
