class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        for i in range(31):
            res=3**i
            if res==n:
                return True
            
        return False
        