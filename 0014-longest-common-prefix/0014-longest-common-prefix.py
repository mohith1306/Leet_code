class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        new_str=""
        min_len=min(len(i) for i in strs)
        for i in range(0,min_len):
            current=strs[0][i]
            if all(current==s[i] for s in strs):
                new_str+=current
            else:
                break
        return new_str
                   
                
        