class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums=[]
        nums=nums1+nums2
        nums.sort()
        length=len(nums)
        if length%2==0:
            return (nums[(length//2)-1]+nums[(length//2)])/2
        else:
            return (nums[(length)//2])
        