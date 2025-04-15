class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        HashMap<Character,Character> rev = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!hm.containsKey(ch1) && !rev.containsKey(ch2)){
                hm.put(ch1,ch2);
                rev.put(ch2,ch1);
            }
            else if(hm.containsKey(ch1) && hm.get(ch1) != ch2){
                return false;
            }
            else if(rev.containsKey(ch2) && rev.get(ch2) != ch1){
                return false;
            }
        }
        return true;
    }
}