def quicksort(L) {
    if(L.size() < 2) return L

    int pivot = (L.size() / 2)
    println "pivot " + L[pivot]

    def high = []
    def low = []

    L.eachWithIndex { e, i ->
        if((i != pivot) && (e <= L[pivot])){
            low << e
        }

        if((i != pivot) && (e > L[pivot])){
            high << e
        }        
    }

    println "low " + low
    println "high " + high

    def sorted = []
    sorted.addAll(quicksort(low))
    sorted << L[pivot]
    sorted.addAll(quicksort(high))

    println "sorted " + sorted

    return sorted
}

A = [13, 6, 7, 2, 9, 11, 4]
W = [4, 5, 6, 7, 8, 9, 1]
L = [97, 18]
O = [4, 5, 3]
E = [4]
println "\n" + quicksort(A)
