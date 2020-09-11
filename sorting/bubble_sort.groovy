def bubbleSort(L) {
    int counterCompare = 0
    int counterSwap = 0

    for(i = 0; i < L.size()-1 ; i++) {
        for(j = 0; j < L.size()-i-1; j++) {
            counterCompare++
            if(L[j+1] < L[j]) {
                counterSwap++
                tmp = L[j]
                L[j] = L[j+1]
                L[j+1] = tmp 
            }
            print "\n" + L
        }
    }

    print "\nVergleiche: " + counterCompare + "\nSwaps: " + counterSwap
    return L
}

L = [13, 6, 7, 2, 9, 11, 4]
println "\n" + bubbleSort(L)
