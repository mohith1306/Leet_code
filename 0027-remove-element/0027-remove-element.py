class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        """new_lst=[]
        n=len(nums)
        for i in nums:
            if i==val:
                nums[i]=nums[n-1]
        
        return n"""
        i = 0
        n = len(nums)
        while i < n:
          if nums[i] == val:
            nums[i] = nums[n - 1]
            n -= 1
          else:
            i += 1
        return n
        