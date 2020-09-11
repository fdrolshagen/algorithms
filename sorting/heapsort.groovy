def heapsort(L){
    L = build_maxheap(L, L.size())

    println "-------------"
    for(int i = L.size() - 1; i >= 0; i--) {
        println L
        println "swap: "
        L = swap(L, 0, i)
        println "heapify:"
        L = max_heapify(L, i, 0)
        println "-------------"
    }

    println "--Result--"
    return L
}

def build_maxheap(L, n) {

    for(int i = (n / 2); i >= 0; i--) {
        L = max_heapify(L, L.size(), i)
    }

    return L
}

def max_heapify(L, n, i) {

    largest = i
    left = (2 * i) + 1
    right = (2 * i) + 2

    if ((left < n) && L[left] > L[largest]) largest = left
    if ((right < n) && L[right] > L[largest]) largest = right

    if(largest != i) {
        L = swap(L, i, largest)
        max_heapify(L, n, largest)
    }

    return L
}

def swap(L, a, b) {
    if(a != b) {
        tmp = L[a]
        L[a] = L[b]
        L[b] = tmp
        println L
    }

    return L
}

A = [13, 6, 7, 2, 9, 11, 4]
W = [4, 5, 6, 7, 8, 9, 10]
L = [97, 18]
O = [4, 5, 3]
E = [4]
H = [4, 6, 1]
//println "\n" + build_maxheap(O, O.size())

println heapsort(E)
