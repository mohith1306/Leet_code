class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        h = len(height) - 1
        max_area = 0
        while l < h:
            width = h - l
            area = width * min(height[l], height[h])
            max_area = max(max_area, area)
            if height[l] < height[h]:
                l += 1
            else:
                h -= 1
        
        return max_area
