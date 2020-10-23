def spiral_matrix(matrix):
    def spiral_matrix_aux(l):
        result = []
        n, m = len(matrix) - (2 * l), len(matrix[0]) - (2 * l)
        
        if n == 1:
            return matrix[l]
        if m == 1:
            return [matrix[i] for i in range(l, n)]
        if n == 0 and m == 0:
            return []

        for i in range(l, m):
            result.append(matrix[l][i])
        for i in range(l, n):
            result.append(matrix[i][m - 1])
        for i in reversed(range(l, m)):
            result.append(matrix[n - 1][i])
        for i in reversed(range(l, n)):
            result.append(matrix[i][l])

        return result + sprial_matrix(l + 1)
