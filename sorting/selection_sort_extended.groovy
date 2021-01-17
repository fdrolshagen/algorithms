def selectionSort(L) {
    int counterCompare = 0
    int counterSwap = 0

    for(i = 0; i < L.size() - 1; i++){

        min1 = i
        min2 = i

        for(j = i+1; j < L.size(); j++) {
            counterCompare++
            if(L[j] < L[min1]){
                min2 = min1
                min1 = j
            }
        }

        if(min1 != i) {
            counterSwap++
            tmp = L[i]
            L[i] = L[min1]
            L[min1] = tmp
        }

        if(min2 != i) {
            counterSwap++
            tmp = L[i+1]
            L[i+1] = L[min2]
            L[min2] = tmp
            i++
        }

    }
    print "\n" + L
    print "\nVergleiche: " + counterCompare + "\nSwaps: " + counterSwap
    return L
}

A = [13, 6, 7, 2, 9, 11, 4]
W = [4, 5, 6, 7, 8, 9, 1]
L = [97, 18]
O = [4, 5, 3]
println "\n" + selectionSort(A)
