package BST;

public class Increasing_order_search_tree {
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = increasingBST(root.left);
        TreeNode right = increasingBST(root.right);
        root.left = null;
        root.right = right;
        if(left == null){
            return root;
        }
        TreeNode temp = left;
        while(temp.right != null){
            temp = temp.right;
        }
        temp.right = root;
        return left;
        
    }
    public static void main(String[] args) {
        Increasing_order_search_tree obj = new Increasing_order_search_tree();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        TreeNode res = obj.increasingBST(root);
        System.out.println(res);
    }
}

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