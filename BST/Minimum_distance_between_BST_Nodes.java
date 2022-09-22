package BST;

public class Minimum_distance_between_BST_Nodes {
    public int minDiffInBST(TreeNode root) {
        int[] min = new int[1];
        min[0] = Integer.MAX_VALUE;
        helper(root, min);
        return min[0];
        
    }
    public int[] helper(TreeNode root, int[] min){
        if(root == null){
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        }
        int[] left = helper(root.left, min);
        int[] right = helper(root.right, min);
        if(left[1] != Integer.MIN_VALUE){
            min[0] = Math.min(min[0], root.val - left[1]);
        }
        if(right[0] != Integer.MAX_VALUE){
            min[0] = Math.min(min[0], right[0] - root.val);
        }
        return new int[]{Math.min(left[0], root.val), Math.max(right[1], root.val)};
    }
    public static void main(String[] args) {
        Minimum_distance_between_BST_Nodes obj = new Minimum_distance_between_BST_Nodes();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int res = obj.minDiffInBST(root);
        System.out.println(res);
    }
}
