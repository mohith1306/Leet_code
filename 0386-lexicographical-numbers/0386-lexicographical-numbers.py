class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        l = []
        for i in range(1,n+1):
            l.append(str(i))
        l.sort()
        ans = [int(i) for i in l]
        return ans
        