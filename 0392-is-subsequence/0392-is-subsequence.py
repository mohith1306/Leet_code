class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        t_iter = iter(t)
        return all(c in t_iter for c in s)