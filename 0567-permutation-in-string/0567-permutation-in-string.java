class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i= 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(map1.containsKey(ch)){
                int prevCount = map1.get(ch)+1;
                map1.put(ch,prevCount);
            }
            else{
                int prevCount = 1;
                map1.put(ch,prevCount);
            }
        }

        for(int i = 0;i<s1.length();i++){
            char ch = s2.charAt(i);
            if(map2.containsKey(ch)){
                int prevCount = map2.get(ch)+1;
                map2.put(ch,prevCount);
            }
            else{
                map2.put(ch,1);
            }
        }
        if(map1.equals(map2)) return true;
        int i = 0;
        int j = s1.length();
        while(j < s2.length()){
            char ch1 = s2.charAt(j);
            char ch2 = s2.charAt(i);
            if(map2.containsKey(ch1)){
                int prevCount = map2.get(ch1)+1;
                map2.put(ch1,prevCount);
            }
            else{
                map2.put(ch1,1);
            }
            if(map2.containsKey(ch2)){
                int prevCount = map2.get(ch2);
                map2.put(ch2,prevCount-1);
                if(map2.get(ch2) == 0){
                    map2.remove(ch2);
                }
            }
            if(map1.equals(map2)){
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}