
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

    ArrayList arrayNew = new ArrayList()
    i = findFib(L.size())

    if(w == L[fib(i-2)]) return true

    if(w < L[fib(i-2)]) {
        //return fibSearch(L[0..fib(i-2)], w)  //alternative mit subarray
        for(j = 0; j < fib(i-2); j++) {
            arrayNew.add(L[j])
        }
    }

    if(w > L[fib(i-2)]) {
        //return fibSearch(L[fib(i-2)..L.size()-1], w) 
        for(j = fib(i-2); j < L.size(); j++) {
            arrayNew.add(L[j])
        }
    }
    
    return fibSearch(arrayNew, w)
}


A = [1, 2, 3, 5, 5, 6, 7]
println fibSearch(A, 12)
println fibSearch(A, 6)
