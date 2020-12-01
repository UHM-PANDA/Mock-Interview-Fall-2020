def enumerate_primes(n):
    boolean_array, result = [True for _ in range(n - 1)], []
    counter = 2

    while counter - 2 < len(boolean_array):
        if boolean_array[counter - 2]:
            result.append(counter)
            for i in range(counter - 2, len(boolean_array), counter):
                boolean_array[i] = False
        counter += 1

    return result
