package dataStructures.tree.divideandconquer;

import dataStructures.tree.dfs.recursionproblems.TreeNode;

public class BalancedBinaryTree {
    //todo: the time complexity is high for this solution. Need a more optimized solution.

    public boolean isBalanced(TreeNode root){
        if (root == null){
            return true;
        }

        if (!isBalanced(root.left)){
            return false;
        }

        if(!isBalanced(root.right)){
            return false;
        }

        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }

    private int getHeight(TreeNode root){ //you can also use divide conquer to solve this:
        //height is the highest level of 左子树和右子树 + 1 <- the 1 represents the level of root
        if (root == null) {
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right)) +1 ;
    }
}
