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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, root, 0);
        return list;
    }
    public void helper(List<List<Integer>> list, TreeNode root, int height) {
        if (root == null) return;
        if (height >= list.size()) {
            list.add(new ArrayList<>());
        }
        if (height % 2 == 0) {
            list.get(height).add(root.val);
        } else {
            list.get(height).add(0, root.val);
        }

        helper(list, root.left, height + 1);
        helper(list, root.right, height + 1);
        
    }
}