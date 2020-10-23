def subset_sum(arrays, x):
    def subset_sum_aux(sub_array, running_sum):
        if running_sum == x:
            return True
        if not sub_array:
            return False

        subset_found = False
        for i in range(len(sub_array)):
            if subset_sum_aux(sub_array[:i] + sub_array[i + 1:], running_sum + sub_array[i]):
                subset_found = True

        return subset_found

    return subset_sum_aux(arrays, 0)
