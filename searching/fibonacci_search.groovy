
def fib(i) {
    if(i < 2) return 1
    return fib(i - 1) + fib (i - 2)
}

def findFib(i) {
    tmp = 0
    while(i > fib(tmp)) tmp++
    return tmp
}

def fibSearch(L, w) {
    if(L.size() == 1 && L[0] == w) return true
    if(L.size() < 2) return false

    i = findFib(L.size())

    if(w == L[fib(i-2)]) return true

    if(w < L[fib(i-2)]) {
        return fibSearch(L[0..fib(i-2) - 1], w)
    }

    if(w > L[fib(i-2)]) {
        return fibSearch(L[fib(i-2)..L.size()-1], w) 
    }

}


A = [1, 2, 3, 5, 5, 6, 7]
println fibSearch(A, 12)
println fibSearch(A, 6)
