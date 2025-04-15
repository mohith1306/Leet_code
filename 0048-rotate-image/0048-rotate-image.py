class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        for i in range(len(matrix)):
            for j in range(0,i+1):
                matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]
        for i in matrix:
            for j in range(len(i)//2):
                i[j],i[len(i)-1-j] = i[len(i)-j-1],i[j]
        return matrix
        