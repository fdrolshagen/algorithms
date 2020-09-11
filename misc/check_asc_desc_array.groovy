
def checkAscDesc(L){
    min = L[0]
    max = L[0]
    i = 0

    while(i < L.size() && (L[i] <= min || L[i] >= max)){
        if(L[i] < min) min = L[i]
        if(L[i] > min) max = L[i]
        i++
    }

    if(min == L[L.size()-1]) return 1
    if(max == L[L.size()-1]) return 2
    return 0
}

D = [4, 3, 2 ,1 ,0, 0 ,0]
A = [1, 2, 3, 5, 5, 6, 7]
E = [1, 1, 1, 1, 1, 1, 1]
U = [13, 6, 7, 2, 9, 11, 4]

println "\n" + checkAscDesc(D)
println "\n" + checkAscDesc(A)
println "\n" + checkAscDesc(U)
println "\n" + checkAscDesc(E)