class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                break;  // Only change the first '6'
            }
        }

        return Integer.parseInt(new String(chars));
    }
}
