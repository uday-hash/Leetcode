/*
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, 
 * where each node in this tree has exactly two or zero sub-node. If the node has
 *  two sub-nodes, then this node's value is the smaller value among its two sub-nodes.
 *  More formally, the property root.val = min(root.left.val, root.right.val) always holds.

Given such a binary tree, you need to output the second minimum value in the 
set made of all the nodes' value in the whole tree.

If no such second minimum value exists, output -1 instead.
 */

package BST;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Second_minimum_node_Binary_Tree {
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null){
            return -1;
        }
        if(root.left == null && root.right == null){
            return -1;
        }
        int left = root.left.val;
        int right = root.right.val;
        if(left == root.val){
            left = findSecondMinimumValue(root.left);
        }
        if(right == root.val){
            right = findSecondMinimumValue(root.right);
        }
        if(left != -1 && right != -1){
            return Math.min(left, right);
        }
        if(left != -1){
            return left;
        }
        return right;
        
    }

    public static void main(String[] args) {
        Second_minimum_node_Binary_Tree obj = new Second_minimum_node_Binary_Tree();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        System.out.println(obj.findSecondMinimumValue(root));
    }
    
}
