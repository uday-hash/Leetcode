package BST;

public class Kth_smallest_element_BST {
    public int kthSmallest(TreeNode root, int k) {
        int[] count = new int[1];
        int[] result = new int[1];
        inorder(root, k, count, result);
        return result[0];
        
    }
    public void inorder(TreeNode root, int k, int[] count, int[] result){
        if(root == null){
            return;
        }
        inorder(root.left, k, count, result);
        count[0]++;
        if(count[0] == k){
            result[0] = root.val;
            return;
        }
        inorder(root.right, k, count, result);
    }
    public static void main(String[] args) {
        Kth_smallest_element_BST obj = new Kth_smallest_element_BST();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(obj.kthSmallest(root, 1));
    }
}
