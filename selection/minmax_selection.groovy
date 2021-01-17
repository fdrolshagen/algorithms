def minmaxsearch(L) {
    def L1 = []
    def L2 = []
    int i = 0

    while(i < L.size()) {
        if(L[i] > L[i+1]) {
            L1 << L[i]
            L2 << L[i+1]
        }
        else {
            L1 << L[i+1]
            L2 << L[i]
        }
        i = i + 2
    }

    result = []
    result << minsearch(L2)
    result << maxsearch(L1)
    return result
}

L = [1, 5, 7, 8, 9, 10]
w = 6

println minmaxSearch3(L)
