def optimal_sort_moves(arr: int[]) -> int:
    sorted_arr, counter = sorted(arr), 0
    for i, ele in enumerate(arr):
        counter += 1 if ele != sorted_arr[i] else 0

    return counter

test = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(optimal_sort_moves(test))
