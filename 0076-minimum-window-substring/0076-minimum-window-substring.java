class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return ""; 
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        int i = 0, j = 0, minLength = Integer.MAX_VALUE, matchCount = 0;
        int start = 0;  
        int requiredMatches = map1.size();
        String result = "";
        while (j < s.length()) {
            char ch = s.charAt(j);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            if (map1.containsKey(ch) && map2.get(ch).intValue() == map1.get(ch).intValue()) {
                matchCount++;
            }
            while (matchCount == requiredMatches) {
                if (j - i + 1 < minLength) {
                    minLength = j - i + 1;
                    start = i;
                }
                char leftChar = s.charAt(i);
                map2.put(leftChar, map2.get(leftChar) - 1);
                if (map1.containsKey(leftChar) && map2.get(leftChar) < map1.get(leftChar)) {
                    matchCount--;
                }
                i++;
            }
            j++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }
}
