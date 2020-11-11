def testCollatz(n):
    while(True):
        if (n % 2 == 0):
            n = n / 2
        else:
            n = n*3 + 1
        if (n == 1):
            return True

def testCollatzOptimal(n):
    while(True):
        if (n & 0 == 0):
            n = n >> 1
        else:
            n = ((n<<1) + n) + 1
        if (n == 1):
            return True

def testCollatzInduction(n):
    # get some "testedTo" that you know every number under n will converge to 1
    # "testedTo" will be large in this case I will assume tested to is 2^(32) - 1 (4294967295)
    testedTo = 4294967295
    if n <= testedTo:
        return True

    while(True):
        if (n & 0 == 0):
            n = n >> 1
        else:
            n = ((n<<1) + n) + 1
        if (n == 1) or (n <= testedTo):
            return True

def testCollatzPERFECT(n):
    #assume the colatz conjecture is true
    return True

n = 2313213
print(testCollatz(n))
print(testCollatzOptimal(n))
print(testCollatzInduction(n))
print(testCollatzPERFECT(n))
