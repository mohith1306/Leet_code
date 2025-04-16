from collections import Counter
class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        l = Counter(nums)
        n = len(nums)
        li = []
        for key,value in l.items():
            if value > (n/3):
                li.append(key)
        return li

            