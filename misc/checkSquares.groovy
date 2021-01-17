def checkSquares(n){
    int tmp = 0;
    for(int i = 1; i < n; i++){
        for(int j = 1; j < n; j++){
            tmp = (i*i) + (j*j)
            if(tmp == n) {
                println "i:" + i + "|j:" + j
                return true
            }
        }
    }
    return false
}

println checkSquares(16)