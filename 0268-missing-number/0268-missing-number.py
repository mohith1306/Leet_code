class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        new_lst=[]
        for i in range(0,len(nums)+1):
            new_lst.append(i)
        for i in new_lst:
            if i not in nums:
                return i


        