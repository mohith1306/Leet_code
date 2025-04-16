class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        l1=[]
        l2=[]
        for i in range(len(s)):
            if s[i] != "#":
                l1.append(s[i])
            elif l1:
                l1.pop()
        for i in range(len(t)):
            if t[i] != "#":
                l2.append(t[i])
            elif l2:
                l2.pop()
        return "".join(l1) == "".join(l2)
                
        