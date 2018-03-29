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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        helper(root, sum, list, tempList);
        return list;
    }
    public void helper(TreeNode root, int sum, List<List<Integer>> list, List<Integer> tempList) {
        if (root == null) return;
        tempList.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            list.add(new ArrayList<>(tempList));
            tempList.remove(tempList.size() - 1);
            return;
        } else {
            helper(root.right, sum - root.val, list, tempList);
            helper(root.left, sum - root.val, list, tempList);
        }
        tempList.remove(tempList.size() - 1);
    }
}w