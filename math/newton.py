import math
import numpy as np

def find_intervals(func, precision=2, start=-10, end=10, step=.1):
    xp = start
    intervals = []
    for i in np.arange(start, end, step):
        xc = i
        if round(func(xp), precision) == 0.0:
            intervals.append((round(xp, precision), round(xp, precision)))
        elif np.sign(func(xc)) != np.sign(func(xp)):
            intervals.append((round(xp, precision), round(xc, precision)))
        xp = xc
    return intervals

def newton(func, funcprime, m, x0):
    if m < 1: return x0
    return newton(func, funcprime, m -1, x0 - (func(x0) / funcprime(x0)))

def f(x):
    return x**3 - 7 * x - 3

def fprime(x):
    return 3 * x**2 - 7

def g(x):
    return x**2

def h(x):
    return x**2

def hprime(x):
    return 2 * x

if __name__ == "__main__":
    intervals = find_intervals(f)

    for interval in intervals:
        med = (interval[0]+interval[1]) / 2
        print(f"[{interval[0]:+.2f},{interval[1]:+.2f}]"
              + f" - x0 = {med:+.4f} - x* = {newton(f, fprime, 5, med):+}")
