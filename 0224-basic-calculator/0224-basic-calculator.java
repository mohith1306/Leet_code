class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int sign = 1;
        int currentNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * currentNumber;
                sign = 1; 
                currentNumber = 0; 
            } else if (ch == '-') {
                result += sign * currentNumber;
                sign = -1;
                currentNumber = 0; 
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result += sign * currentNumber;
                currentNumber = 0;
                result *= stack.pop();
                result += stack.pop(); 
            }
        }
        result += sign * currentNumber;
        return result;
    }
}