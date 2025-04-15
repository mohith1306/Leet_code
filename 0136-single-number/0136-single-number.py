from collections import Counter
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        l = Counter(nums)
        for key,value in l.items():
            if value == 1:
                return key
        