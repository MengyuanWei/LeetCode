class Untitled {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), 1, n, k);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> tempList, int start, int n, int k) {
        if (tempList.size() == k) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i <= n; i++) {
            tempList.add(i);
            helper(res, tempList, i + 1, n, k);
            tempList.remove(tempList.size() - 1);
        }
    }
}