

def bubbleSort(L) {
    if(L.size() < 2) return L

    for(int i = 0; i < L.size() - 1; i++){
        for(int j = 0; j < L.size()-i-1; j++){
            if(L[j] > L[j+1]){
                tmp = L[j+1]
                L[j+1] = L[j]
                L[j] = tmp
            }
        }
    }
    return L
}

def selectionSort(L){
    if(L.size() < 2) return L

    for(int i = 0; i < L.size() - 1; i++){
        min = i
        for(int j = i + 1; j < L.size(); j++){
            if(L[j] < L[min]) min = j
        }

        tmp = L [i]
        L[i] = L[min]
        L[min] = tmp
    }
    return L
}

def insertionSort(L){
    if(L.size() < 2) return L

    for(int i = 0; i < L.size() - 1; i++){
        int j = i
        key = L[i]
        while((j > 0) && L[j] > key){
            L[j] = L[j-1]
            j--
        }
        L[j] = key
    }
    return L
}

A = [3, 2, 1]
println(bubbleSort(A))
println(selectionSort(A))
println(insertionSort(A))