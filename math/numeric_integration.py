import math

def trapezoid(func, n, a, b, precision=4):
    h = (b - a) / n
    summe = 0
    print(f"0 - {0} - {round(func(a), precision)}")
    for i in range(1, n):
        xi = round(i*h, precision)
        y = round(func(xi), precision)
        summe += y
        print(f"{i} - {xi} - {y}")
    print(f"{n} - {b} - {round(func(b), precision)}")
    return round((h / 2) * (summe * 2 + func(a) + func(b)), precision)

def f(x):
    return math.exp(-(x**2))

if __name__ == "__main__":
    print(trapezoid(f, 5, 0, 1))
