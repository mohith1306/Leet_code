class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int left = 0;
        int right = 0;
        int leftLength = players.length;
        int rightLength = trainers.length;
        int count = 0;
        while(left < leftLength && right < rightLength){
            if(players[left] <= trainers[right]){
                count++;
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        return count;
    }
}