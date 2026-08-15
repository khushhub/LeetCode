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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        hight(root);
        return diameter-1;
    }
    int hight (TreeNode node){
        if(node ==null){
            return 0;
        }
        int lefthight=hight(node.left);
        int righthight=hight(node.right);
        int dia=righthight+lefthight+1;
        diameter=Math.max(diameter,dia);
        return Math.max(lefthight,righthight)+1;
    }
}