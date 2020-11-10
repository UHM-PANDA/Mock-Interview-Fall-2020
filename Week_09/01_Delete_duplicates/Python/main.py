def delete_duplicates(array):
    j = 0
    for i, elem in enumerate(array):
        if elem != array[j]:
            j += 1
            array[i], array[j] = array[j], array[i]
    return array[:j + 1]

print(delete_duplicates([1, 1, 1, 1, 2, 3, 3, 4]))
