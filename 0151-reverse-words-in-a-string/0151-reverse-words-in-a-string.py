class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split()
        new_str = ""
        while words:
            new_str+=(words[-1])
            words.pop()
            new_str+= " "
        return new_str[0:-1]
            
        