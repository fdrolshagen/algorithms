def selectionSort(L) {

    for(i = 0; i < L.size() - 1; i++){
        min = i
        for(j = i+1; j < L.size(); j++){
            if(L[j] < L[min]){
                min = j
            }
        }

        if(min != i){
            counterSwap++
            tmp = L[i]
            L[i] = L[min]
            L[min] = tmp
        }
    }
    return L
}

A = [13, 6, 7, 2, 9, 11, 4]
W = [4, 5, 6, 7, 8, 9, 1]
O = [4, 5, 3]
println "\n" + selectionSort(A)
