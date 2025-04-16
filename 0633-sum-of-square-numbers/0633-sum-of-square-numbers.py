class Solution:
    def judgeSquareSum(self, c: int) -> bool:

        # Handle the base case (0 can be expressed as the sum of two 0s)
        if c == 0:
            return True

        # Check if negative numbers can be expressed as sum of squares (not possible)
        if c < 0:
            return False

        # Efficiently iterate only up to the square root of c
        for a in range(int(c**0.5) + 1):
            b = c - a**2

            # Check if b is also a perfect square
            if b >= 0 and int(b**0.5) == b**0.5:
                return True

        return False
