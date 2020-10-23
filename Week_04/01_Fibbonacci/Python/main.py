def fibbonacci_recursive(n):
    if n > 2:
        return fibbonacci_recursive(n - 1) + fibbonacci_recursive(n - 2)
    return 1

def fibbonacci_memo(n):
    memo = [0, 1, 1] + [None for _ in range(n - 2)]
    def fibbonacci_memo_aux(n):
        if memo[n]:
            return memo[n]

        memo[n] = fibbonacci_memo_aux(n - 1) + fibbonacci_memo(n - 2)
        return memo[n]

    fibbonacci_memo_aux(n)
    return memo[n]

def fibbonaci(n):
    first, second = 1, 1
    for _ in range(n - 2):
        first, second = second, first + second

    return second
