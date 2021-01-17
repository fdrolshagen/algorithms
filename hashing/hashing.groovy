def first_two_digits(int k) {
    while (k > 100) {
        k /= 10
    }
    return k
}

def modulo(k, m) {
    return k % m
}

def multiplication(k, m) {
    double factor = (Math.sqrt(5.0)-1)/2
    return (int) Math.floor((factor*k-Math.floor(factor*k))*m)
}

println first_two_digits(112312)
println modulo(27034605, 100) //bad with powers of 10
println modulo(27034605, 877) //better with prime numbers
println modulo(27034605, 997)
println multiplication(1, 29)
println multiplication(29, 29)
println multiplication(500, 29)
