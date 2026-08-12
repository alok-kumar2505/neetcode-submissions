/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         while(root!=null){
            if(p.val<root.val && q.val<root.val){ //if both value are less then we go in left
                root=root.left;
            }else if(p.val>root.val && q.val >root.val){ // if both values are greater then we go in right
                root=root.right;
            }else{ //this handle if one in left and another is in right also one in left orright and another is root itself because parent can be own descendant
                return root;
            }
        }
        return root;

        
    }
}
