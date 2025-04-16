from collections import Counter
class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        c = Counter(nums)
        l = []
        for key,value in c.items():
            if value == 2:
                l.append(key)
        return l