from collections import Counter
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        c = Counter(nums)
        l = []
        for key,value in c.items():
            if value == 1:
                l.append(key)
        return l