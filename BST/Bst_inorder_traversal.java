/*
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.

 
 */
package BST;

import java.util.ArrayList;
import java.util.List;

public class Bst_inorder_traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
        
    }
    public void inorder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
    public static void main(String[] args) {
        Bst_inorder_traversal obj = new Bst_inorder_traversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(obj.inorderTraversal(root));
    }
    
}
