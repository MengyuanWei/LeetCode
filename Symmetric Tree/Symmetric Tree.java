class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return symmetricHelper(root.left, root.right);
    }
    public boolean symmetricHelper(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return symmetricHelper(left.left, right.right) && symmetricHelper(left.right, right.left);
    }
}