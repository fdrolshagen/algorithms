
def matching(p, S){
    found = false
    (0..(S.size() - p .size())).each { si ->
        nrMatched = 0
        (0..p.size()-1).each { pi ->
            if(p[pi] == S[si+pi]){
                nrMatched++
            }
        }
        if(nrMatched == p.size()) found = true
    }
    return found
}

S = "Algoirithmus"
p = "Algo"
println matching(p, S)