class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        def divide(n):
            real = n
            while(n>0):
                rem = n % 10
                if rem == 0  or real % rem != 0:
                    return False
                n = n // 10
            return True
        return [i for i in range(left,right+1) if divide(i)]