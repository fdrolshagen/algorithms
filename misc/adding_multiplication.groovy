//adding and multiplying two non-negative integers by only using +-1

def add(a, b) {
    if(b == 0) return a
    return add(a, b - 1) + 1
}

def mult(a, b) {
    if((a == 0) || (b == 0)) return 0
    if(b == 1) return a
    return add(mult(a, b - 1), a)
}

println mult(12, 12)
