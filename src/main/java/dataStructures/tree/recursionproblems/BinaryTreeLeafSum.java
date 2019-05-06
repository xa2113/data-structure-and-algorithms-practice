package dataStructures.tree.recursionproblems;

public class BinaryTreeLeafSum {

    private int sum = 0;
    public int leafSum(TreeNode root){
        sum = 0;
        traverse(root);
        return sum;
    }

    private void traverse(TreeNode root){
        if(root == null) return;

        if(root.left == null && root.right == null){
            sum += root.val;
        }
        traverse(root.left);
        traverse(root.right);

    }
}
