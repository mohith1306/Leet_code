class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            int val = (direction == 1) ? 1 : -1;
            diff[start] += val;
            if (end + 1 < n) {
                diff[end + 1] -= val;
            }
        }
        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int netShift = diff[i] % 26;
            chars[i] = shiftChar(chars[i], netShift);
        }

        return new String(chars);
    }

    private char shiftChar(char ch, int shift) {
        int base = 'a';
        int offset = (ch - base + shift + 26) % 26;
        return (char) (base + offset);
    }
}
