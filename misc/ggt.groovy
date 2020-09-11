
def ggt(a,b){

    if(a < b){
        if((b % a) == 0){
            return a
        }
    }
    else{
        if((a % b) == 0){
            return b
        }
    }

     while(a != b){  
         if(a > b){
             tmp = a
             a = b
             b = tmp
         }
         b = b - a 
     }
     return a
}

println ggt(2,20000000)
