package BST;

public class Two_sum_IV {
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        return find(root, root, k);
        
    }
    public boolean find(TreeNode root, TreeNode node, int k){
        if(node == null) return false;
        return search(root, node, k - node.val) || find(root, node.left, k) || find(root, node.right, k);
    }
    public boolean search(TreeNode root, TreeNode node, int k){
        if(root == null) return false;
        return (root.val == k) && (root != node) || (root.val < k) && search(root.right, node, k) || (root.val > k) && search(root.left, node, k);
    }

    public static void main(String[] args) {


    }

}
