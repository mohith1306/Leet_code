class Solution:
    def hammingWeight(self, n: int) -> int:
        def itb(n):
            m=""
            while n>0:
                m+=str(int(n)%2)
                n=n//2
            return m
        binary=itb(n)
        count=0
        for i in str(binary):
            if i=='1':
                count+=1
        return count

        