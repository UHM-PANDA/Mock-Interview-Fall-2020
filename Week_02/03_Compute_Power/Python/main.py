def power(x, y):
    result = 1
    power = y if y >= 0 else -y
    x = x if y >= 0 else 1 / x

    while power != 0:
        result *= x if (power & 1) != 0 else 1
        x *= x
        power >>= 1

    return result
