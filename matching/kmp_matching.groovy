//10100111
def next(j) {
    if (j == 0) return 0
    if (j == 1) return 1
    if (j == 2) return 0
    if (j == 3) return 1
    if (j == 4) return 3
    if (j == 5) return 0
    if (j == 6) return 2
    if (j == 7) return 2
    return 0
}

//10100111
def next2(j) {
    if (j == 0) return 0
    if (j == 1) return 0
    if (j == 2) return 1
    if (j == 3) return 2
    if (j == 4) return 0
    if (j == 5) return 1
    if (j == 6) return 1
    if (j == 7) return 1
    return 0
}

//KOKOS
def next3(j) {
    if (j == 0) return 0
    if (j == 1) return 0
    if (j == 2) return 1
    if (j == 3) return 2
    if (j == 4) return 0
    if (j == 5) return 1
    return 0
}

def kmp(p, S) {
    si = 0
    pi = 0
    while((si < S.length()) && (pi < p.length())) {
        if(p[pi] == S[si]) {
            if(pi == p.length()-1) return true
            pi++
        }
        else {
            pi = next(pi)
        }
        si++
    }
    return false
}

def kmp2(p, S) {
    i = 0
    j = 0
    while(i < S.length()) {
        if(p[j] == S[i]) {
            i++
            j++
        }

        if(j == p.length()) {
            j = next3(j-1)
            return true
        }
        else if((i < S.length()) && p[j] != S[i]) {
            
            if(j != 0) {
                j = next3(j-1)
            }
            else {
                i++
            }
        }
    }
    return false 
}

p='101001'
S='1010101001'

//p='KOKOS'
//S='KOKOKOKOKOKOS'

//println kmp(p, S)
println kmp2(p, S)
