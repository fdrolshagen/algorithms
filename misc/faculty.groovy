
def fak(n){
    faktor = n
    erg = 1
    while(faktor > 0){
        erg = erg * faktor
        faktor--
    }
    return erg    
}

println fak(3)
