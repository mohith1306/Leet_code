import java.util.*;
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> numbers = new ArrayList<>();
        for(int i=1;i<n+1;i++){
            int num = i;
            numbers.add(Integer.toString(num));
        }
        Collections.sort(numbers);
        List<Integer> ans = new ArrayList<>();
        for(String numb:numbers){
            ans.add(Integer.parseInt(numb));
        }
        return ans;
    }
}