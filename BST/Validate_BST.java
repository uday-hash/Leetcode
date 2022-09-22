/*
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */
package BST;

public class Validate_BST {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
        
    }
    public boolean isValidBST(TreeNode root, Integer min, Integer max){
        if(root == null){
            return true;
        }
        if(min != null && root.val <= min){
            return false;
        }
        if(max != null && root.val >= max){
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
    public static void main(String[] args) {
        Validate_BST obj = new Validate_BST();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(obj.isValidBST(root));
    }
    
}
