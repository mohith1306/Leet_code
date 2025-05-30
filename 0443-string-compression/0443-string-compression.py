from typing import List

class Solution:
    def compress(self, chars: List[str]) -> int:
        if len(chars) == 1:
            return 1
        count = 1
        i = 0
        j = 1
        while j < len(chars):
            if chars[i] == chars[j]:
                count += 1
            else:
                if count > 1:
                    for digit in str(count):
                        i += 1
                        chars[i] = digit
                i += 1
                chars[i] = chars[j]
                count = 1
            j += 1
        if count > 1:
            for digit in str(count):
                i += 1
                chars[i] = digit
        
        return i + 1
