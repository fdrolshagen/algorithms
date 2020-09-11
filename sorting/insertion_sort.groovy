def insertionSort(L){
    for(i = 1; i < (L.size); i++){
        key = L[i]
        int j = i
        while((j > 0) && (L[j - 1] > key)){
            L[j] = L[j - 1]
            j--
        }
        
        L[j] = key
        println L
    }
    return L
}

L = [12, 5, 7, 13, 1]
println L
println insertionSort(L)