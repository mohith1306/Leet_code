class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        """new_lst=[]
        new_lst=list(set(nums))
        print(new_lst)"""
        l1=[]
        for i in nums:
            if i not in l1:
                l1.append(i)
        nums[:len(l1)] = l1
        return len(l1)
        