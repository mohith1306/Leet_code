class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int x1 = coordinate1.charAt(0) - 'a' + 1;  
        int y1 = coordinate1.charAt(1) - '0';      

        int x2 = coordinate2.charAt(0) - 'a' + 1;  
        int y2 = coordinate2.charAt(1) - '0';      
        return (Math.abs(x1 - x2) + Math.abs(y1 - y2)) % 2 == 0;
    }
}
