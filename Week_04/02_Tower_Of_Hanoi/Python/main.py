def towers_of_hanoi(n):
    def towers_of_hanoi_aux(remainder, from_peg, to, use):
        if remainder > 0:
            towers_of_hanoi_aux(remainder - 1, from, to, use)
            pegs[to].append(pegs[from].pop())
            result.append([from, to])
            towers_of_hanoi_aux(remainder - 1, use, to, from)

    result = []
    pegs = [list(reversed(range(1, n + 1)))] + [[] for _ in range(1, NUM_PEGS)]
    towers_of_hanoi_aux(n, 0, 1, 2)
