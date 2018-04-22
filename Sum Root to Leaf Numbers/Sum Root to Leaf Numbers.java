/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public int sumNumbers(TreeNode root) {
		return dfs(root, 0);
	}
	public int dfs(TreeNode root, int s) {
		if (root == null) return 0;
		if (root.left == null && root.right == null) {
			return root.val + s * 10;
		} else {
			return dfs(root.left, s * 10 + root.val) + dfs(root.right, s * 10 + root.val);
		}
	}
}