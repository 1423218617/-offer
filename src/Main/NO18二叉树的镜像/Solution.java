package Main.NO18二叉树的镜像;
/**
 *
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 */

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class Solution {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode t;
        t=root.left;
        root.left=root.right;
        root.right=t;
        Mirror(root.left);
        Mirror(root.right);
    }
}