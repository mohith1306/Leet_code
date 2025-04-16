class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        int n = num.length();

        for (int i = 0; i < n; i++) {
            char digit = num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            if (!stack.isEmpty() || digit != '0') {
                stack.push(digit);
            }
        }
        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
