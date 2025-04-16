class Solution {
    public String convertDateToBinary(String date) {
        String[] splitted = date.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitted.length; i++) {
            int num = Integer.parseInt(splitted[i]);
            String binary = Integer.toBinaryString(num);
            sb.append(binary);
            if (i != splitted.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }
}
