package Main.NO17树的子结构;


/**
 *
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
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
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null || root1==null){
            return false;
        }

        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2)
                || isSame(root1.left,root2.left)&&isSame(root1.right,root2.right);

    }
    boolean isSame(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root1.val==root2.val){
            return isSame(root1.left,root2.left)&&isSame(root1.right,root2.right);
        }else{
            return false;
        }
    }
}