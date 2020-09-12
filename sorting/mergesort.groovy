def mergesort(L) {
    if(L.size() < 2) return L

    int pivot = (L.size() / 2)
    println "pivot " + L[pivot]

    def A1 = []
    def A2 = []

    L.eachWithIndex { e, i ->
        if(i < pivot) A1 << e
        if(i >= pivot) A2 << e      
    }

    println "low " + A1
    println "high " + A2

    A1 = mergesort(A1)
    A2 = mergesort(A2)

    def sorted = []
    while((A1.size() + A2.size()) > 0) {
        counterCompare++
        if((A1.size() > 0) && (A2.size() > 0)) {
            if(A1[0] < A2[0]){
                sorted << A1[0]
                A1.remove(0)
            }
            else {
                sorted << A2[0]
                A2.remove(0)
            }
        }
        else {
            if(A1.size() > 0) sorted.addAll(A1)
            else sorted.addAll(A2)
            return sorted
        }
    }

    println "sorted " + sorted

    return sorted
}

counterCompare = 0
A = [13, 6, 7, 2, 9, 11, 4]
W = [4, 5, 6, 7, 8, 9, 1]
L = [97, 18]
O = [4, 5, 3]
E = [1, 1, 1, 1, 1, 1]
println "\n" + mergesort(E)
println counterCompare
