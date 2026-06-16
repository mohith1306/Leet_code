class Solution {
    public String processStr(String s) {
        Deque<Character> dq = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                dq.addLast(ch);
            }
            else if (ch == '*') {
                if (!dq.isEmpty()) {
                    dq.pollLast();
                }
            }
            else if (ch == '#') {
                List<Character> copy = new ArrayList<>(dq);
                for (char c : copy) {
                    dq.addLast(c);
                }
            }
            else if (ch == '%') {
                Deque<Character> rev = new LinkedList<>();
                while (!dq.isEmpty()) {
                    rev.addLast(dq.pollLast());
                }
                dq = rev;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : dq) {
            sb.append(c);
        }
        return sb.toString();
    }
}