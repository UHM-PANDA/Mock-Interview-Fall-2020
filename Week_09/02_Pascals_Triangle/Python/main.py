def pascal(n):
    output = [[1], [1, 1]]
    for i in range(2, n):
        output.append([1 if j == 0 or j == len(output[i - 1]) else output[i - 1][j - 1] + output[i - 1][j] for j in range(len(output[i - 1]) + 1)])
    return output[:n]

def pascal_not_scary(n):
    output = [[1], [1, 1]]
    for i in range(2, n):
        new_level = []
        for i in range(len(output[i - 1]) + 1):
            new_level.append(

print(pascal(5))
