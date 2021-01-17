def back(j){
    if(j == "A") return 4
    if(j == "l") return 3
    if(j == "g") return 2
    return 1
}

def matchingBoyerMoore(p, S){
    si = p.size() - 1
    pi = p.size() - 1
    println pi  + " " + si

    while(si < S.size()){
        if(p[pi] == S[si]){
            if(pi == 0) return true
            pi = pi - 1
            si = si - 1    
        }
        else{
            si = si + back(p[pi])
            pi = p.size() - 1
        }
        println pi  + " " + si
    }
    return false
}

println "pi si"
println(matchingBoyerMoore("Algo", "rlgoithAlgomus"))
