//TODO deviation

def mean(L){
    int sum = 0;
    for(int i = 0; i < L.size(); i++){
        sum += L[i]
    }
    return sum / L.size()
}

L = [1, 2, 3, 4, 3, 2, 1]
println mean(L)
