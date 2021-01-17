def quickselection(L, k) {
    if(L.size <= 1) return L[L.size()-k]

    L1 = []
    L2 = []
    int pivot = (L.size/2)
    L.eachWithIndex { e, i ->
        if((i != pivot) && e <= L[pivot]) L1 << e
        if(e > L[pivot]) L2 << e
    }

    if(L2.size() >= k) return quickselection(L2, k)
    if(L2.size()+1 == k) return L[pivot]
    return quickselection(L1, k-L2.size()-1)
}

L = [1, 5, 7, 8, 9, 10]
w = 6

println quickselection(L, 2)
