package dataStructures.tree.recursionproblems;

public class MaxDepthOfBinaryTree {

    private int height = 0;

    public int maxDepth(TreeNode root){
        height = 0;
        helper(root,1);
        return height;
    }

    private void helper(TreeNode root, int depth){
        if(root == null) return;

        height = Math.max(depth,height);
        helper(root.left, depth +1);
        helper(root.right, depth + 1);
    }
}
