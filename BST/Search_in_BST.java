package BST;

public class Search_in_BST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(root.val < val){
            return searchBST(root.right, val);
        }
        return searchBST(root.left, val);
    }
    public static void main(String[] args) {
        Search_in_BST obj = new Search_in_BST();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        TreeNode res = obj.searchBST(root, val);
        System.out.println(res);
    }
    
}
