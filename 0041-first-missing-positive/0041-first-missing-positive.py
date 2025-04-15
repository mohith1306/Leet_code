class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        counter = Counter(nums)
        maxx = max(nums)
        for i in range(1,maxx):
            if counter[i] == 0:
                return i
        if maxx < 0:
            return 1
        return maxx+1