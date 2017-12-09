import java.util.*;
class Solution {
	public List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if (digits.length() == 0)
			return ans;
		String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			while (ans.peek().length() == i) {
				String t = ans.remove();
				for (char c : mapping[x].toCharArray())
					ans.add(t + c);
			}
		}
		return ans;
	}
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.print(s.letterCombinations("23"));
		
	}
}