class Solution:
    def nearestPalindromic(self, n: str) -> str:
        num = int(n)

        # Handle single-digit edge cases
        if len(n) == 1:
            return str(num - 1) if num > 0 else "0"

        # Function to check if a number is a palindrome
        def is_palindrome(x):
            s = str(x)
            return s == s[::-1]

        # Generate candidates by mirroring the first half and adjusting
        candidates = set()
        half = int(n[:(len(n) + 1) // 2])  # Get the first half (rounded up)

        # Generate potential candidates
        for diff in (-1, 0, 1):
            prefix = str(half + diff)
            if len(n) % 2 == 0:
                candidate = int(prefix + prefix[::-1])  # Even-length palindrome
            else:
                candidate = int(prefix + prefix[-2::-1])  # Odd-length palindrome
            candidates.add(candidate)

        # Edge cases for numbers like 1000 or 999
        candidates.add(10**(len(n) - 1) - 1)  # e.g., 999 for 1000
        candidates.add(10**len(n) + 1)        # e.g., 10001 for 9999

        # Remove the original number if it's in the set
        candidates.discard(num)

        # Find the nearest palindrome by minimum distance
        return str(min(candidates, key=lambda x: (abs(x - num), x)))
