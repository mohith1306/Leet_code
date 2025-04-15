class Solution:
    def addBinary(self, a: str, b: str) -> str:
        if a=='0' and b=='0':
            return "0"
        def bti(n):
            num1 = 0
            for i in range(len(n)):
                num1 = num1+(int(n[-(i+1)])*(2**i))
            return num1
        n1 = bti(a)
        n2 = bti(b)
        def itb(m):
            s = ""
            while m>0:
                s += str((m) % 2)
                m = m // 2

            return s[::-1]
        return itb(n1+n2)



                
        