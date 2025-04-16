class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        long sum = 0; 
        for (int i = n - 1; i >= 0; i--) {
            sum += shifts[i];
            sum %= 26;
            char newChar = (char) ('a' + (s.charAt(i) - 'a' + (int)sum) % 26);
            sb.setCharAt(i, newChar);
        }
        return sb.toString();
    }
}
