class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        new_lst=[]
        new_lst=[x for x in nums if nums.count(x)==1]
        return new_lst[0]
            
        