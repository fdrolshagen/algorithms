import math

def bisect(func, d, a, b, verbose=False):
    xm = (a + b) / 2
    pm = func(xm) * func(a)
    if verbose:
        print(f"a: {a:<15} - b: {b:<15} - xm: {xm:<15} - pm: {pm:<.2f}")

    if f(xm) == 0 or ((b - a) < (10**-d)): return xm
    if pm > 0: return bisect(func, d, xm, b, verbose)
    if pm < 0: return bisect(func, d, a, xm, verbose)

def f(x):
    return math.exp(-x) - math.sin(2*x)

def g(x):
    return (x * x) - 2

def h(x):
    return 2 * (x**3) + x - 2

def i(x):
    return math.sin(x)


if __name__ == "__main__":
    print(f"x* = {bisect(i, 8, 3.1, 3.2, True)}")
