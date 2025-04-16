class Solution:
    def countDigitOne(self, n: int) -> int:
        count = 0
        i = 1
        while i <= n:
            divider = 10 * i
            count += (n // divider) * i + min(max(n % divider - i + 1, 0), i)
            i *= 10
        return count
