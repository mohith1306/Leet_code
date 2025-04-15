class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        '''for i in range(n):
            nums1.append(nums2[i])
        for i in range(m+n):
            if nums1[i]==0:
                nums1.remove(nums1[i])
        nums1.sort()'''
        for i in range(n):
            nums1[m+i]=nums2[i]
        print(nums1.sort())
        