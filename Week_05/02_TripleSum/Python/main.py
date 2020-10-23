def triplesum(array, key):
    array.sort()
    return any(twosum(array, key - a) for a in A)

def twosum(array, key):
    memo = {key - elem : i for i, elem in enumerate(array)}
    for i, elem, in enumerate(array):
        if memo[elem] and memo[elem] != i:
            return True
    return False
