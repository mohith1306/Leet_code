class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range(0,len(matrix)):
            for j in range(0,len(matrix[i])):
                if target in matrix[i]:
                    return True
                break
        return False
        