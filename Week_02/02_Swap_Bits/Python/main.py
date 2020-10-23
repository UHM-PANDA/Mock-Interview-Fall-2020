def swap_bits(x, i, j):
    return x if ((x >> j) & 1) == (x >> j) & 1 else x ^ ((1 << i) | 1 << j)
