class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res, new ArrayList<>(), target, candidates, 0);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> tempList, int remain, int[] candidates, int start) {
        if (remain < 0) return;
        else if (remain == 0) {
            res.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                tempList.add(candidates[i]);
                helper(res, tempList, remain - candidates[i], candidates, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}