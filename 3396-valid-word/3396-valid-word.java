class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean isVowel = false;
        boolean isConsonants = false;
        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                char lower = Character.toLowerCase(ch);
                if(
                    lower == 'a' ||
                    lower == 'e'||
                    lower == 'i' ||
                    lower=='o' ||
                    lower == 'u'
                ){
                    isVowel = true;
                }
                else{
                    isConsonants = true;
                }
            }
            else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return isVowel && isConsonants;
    }
}