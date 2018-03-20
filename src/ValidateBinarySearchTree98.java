public class ValidateBinarySearchTree98 {
//https://leetcode.com/problems/validate-binary-search-tree/description/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && min >= root.val) || (max != null && max <= root.val)) return false;
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}
