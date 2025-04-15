class Solution {
    public boolean isPalindrome(String str){
        int low = 0;
        int high = str.length()-1;
        while(low < high){
            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int maxLength = 1;
        String newString = s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+maxLength;j<=s.length();j++){
                if(j - i > maxLength && isPalindrome(s.substring(i,j))){
                    maxLength = j-i;
                    newString = s.substring(i,j);
                }
            }
        }
        return newString;
    }
}