def insertionSort(L) {
    for(i = 1; i < L.size(); i++){
        j = i
        key = L[i]
        while(j > 0 && L[j-1] > key){
            L[j] = L[j-1]
            j--
        }
        L[j] = key
    }
    return L
}

def insertionSortExtendend(L) {
    for(i = 1; i < L.size(); i++){
        j = i - 1
        key = L[i]
        loc = binarySearch(L[0..i], L[i])

        while(j >= loc){
            L[j+1] = L[j]
            j--
        }

        L[j+1] = key
        println L
    }
    return L
}

def binarySearch(L, w){
    first = 0 
    last = L.size()-1
    maxKey = last

    while(first <= last){
        int mid = (first+last)/2
        if(L[mid] < w){
            first = mid + 1
        }
        else{
            if(L[mid] >= w) maxKey = mid
            last = mid - 1
        }
    }
    return maxKey
}

A = [13, 6, 7, 2, 9, 11, 4]
W = [4, 5, 6, 7, 8, 9, 1]
S = [1, 2, 3, 5, 5, 6, 7]
//println "\n" + insertionSort(A)

println "\n" + insertionSortExtendend(A)


//println "\n" + binarySearch(S, 4)