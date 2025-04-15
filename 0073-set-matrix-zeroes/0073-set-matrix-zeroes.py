class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        indices = []
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == 0:
                    indices.append([i,j])
        for i, j in indices:
            for col in range(len(matrix[0])):
                matrix[i][col] = 0
            for row in range(len(matrix)):
                matrix[row][j] = 0
        return matrix


        