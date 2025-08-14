class Solution {
    public String largestGoodInteger(String num) {
        String str = "";
        for(int i=0;i<num.length() - 2 ;i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                if(str.length() == 0){
                    str = num.substring(i,i+3);
                }
                else if(num.substring(i, i+3).compareTo(str) > 0){
                    str = num.substring(i,i+3);
                }
            }
        }
        return str;
    }
}