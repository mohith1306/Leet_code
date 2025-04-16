class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        new_lst=[]
        for i in nums1:
            if i in nums2:
                new_lst.append(i)
        return set(new_lst)