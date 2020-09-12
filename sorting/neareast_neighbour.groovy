def nearest_neighbour(L, min) {
    if(L.size() < 2 ) return min
    if(L.size() == 2) return (L[1] - L[0])

    def L1 = []
    def L2 = []
    int pivot = (L.size()/2)
    L.eachWithIndex{ e, i ->
        if(i < pivot) L1 << e
        if(i >= pivot) L2 << e
    }

    min1 = nearest_neighbour(L1, min)
    if(min1 < min) min = min1
    min2 = (L2[0] - L1[L1.size()-1])
    if((min2 < min)) min = min2
    min3 = nearest_neighbour(L2, min)
    if((min3 < min)) min = min3

    return min
}

T = [1, 9, 21, 34, 36, 100, 101]
println nearest_neighbour(T, 99999)
