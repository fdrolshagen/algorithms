

def linearSearch(w, L){
    i = 0
    while(i < L.size()){
        if(L[i] == w) return true
        i++
   }
   return false
}

L = [1, 5, 7, 8, 9]
w = 6

println linearSearch(w, L)

