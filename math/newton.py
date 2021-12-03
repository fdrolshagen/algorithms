import math
import numpy as np

def find_intervals(func, precision=2, start=-10, end=10, step=.1, verbose=False):
    xp = start
    intervals = []
    for i in np.arange(start, end, step):
        xc = i
        if verbose:
            print(f"{xp:3} | {round(func(xp),2):+}")
        if round(func(xp), precision) == 0.0:
            intervals.append((round(xp, precision), round(xp, precision)))
        elif np.sign(func(xc)) != np.sign(func(xp)):
            intervals.append((round(xp, precision), round(xc, precision)))
        xp = xc
    return intervals

def newton(func, funcprime, m, x0):
    if m < 1: return x0
    return newton(func, funcprime, m -1, x0 - (func(x0) / funcprime(x0)))

def newtonround(func, funcprime, m, x0, precision=4):
    if m < 1: return x0
    y = round(func(x0), precision)
    yprime = round(funcprime(x0), precision)
    x1 = round(x0 - (y / yprime), precision)
    print(f"{float(x0):<+.9} - ({y} / {yprime}) =  {x1:+}")
    return newtonround(func, funcprime, m -1, x1, precision)

def i(x):
    return x**3 - 2 * x + 2 

def iprime(x):
    return 3 * x**2 - 2

if __name__ == "__main__":
    intervals = find_intervals(i, step=1, verbose=True)

    print("-----------------------------")

    for interval in intervals:
        med = (interval[0]+interval[1]) / 2
        print(f"[{interval[0]:+.2f},{interval[1]:+.2f}]"
              + f" - x0 = {med:+.4f} - x* = {newton(i, iprime, 7, med):+}")
        newtonround(i, iprime, 7, round(med, 4), precision=5)
        print("-----")
        