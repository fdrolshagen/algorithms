
def calculatePivot(L, first, last, w) {
    return (first + ((w - L[first]) / (L[last] - L[first]) * (last - first)))
}

//wie binary search nur pivot element wird mit Gewichtung berechnet
def interpolSearch(L, w){
    first = 0
    last = L.size()-1

    while(first <= last){
        middle = calculatePivot(L, first, last, w)

        if(L[middle] == w) return true

        if(L[middle] < w) first = middle + 1
        if(L[middle] > w) last = middle - 1
    }
    return false
}


A = [1, 2, 3, 5, 5, 6, 7]
println interpolSearch(A, 12)
println interpolSearch(A, 6)
