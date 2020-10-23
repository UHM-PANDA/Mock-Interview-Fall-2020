def twosum(arrays, key):
    memo = {key - elem : i for i, elem in enumerate(arrays)}
    for i, elem in enumerate(memo):
        if memo[elem] and memo[elem] != i:
            return True
    return False
