class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        temp=0
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]>=nums[j]:
                    temp=nums[i]
                    nums[i]=nums[j]
                    nums[j]=temp
        nums
        