def even_odd(value):
    if value % 2:
        return -1
    return 0 if value % 4 else 1

print(even_odd(5))
