import java.util.*;

class Solution {
    public void rec(ArrayList<String> ans, String digits, StringBuilder sb, int index, Map<Integer, String> map) {
        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        
        String s = map.get(digits.charAt(index) - '0');
        for (int j = 0; j < s.length(); j++) {
            sb.append(s.charAt(j));
            rec(ans, digits, sb, index + 1, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        
        ArrayList<String> ans = new ArrayList<>();
        rec(ans, digits, new StringBuilder(), 0, map);
        return ans;
    }
}
