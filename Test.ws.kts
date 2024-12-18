fun afficherNombres(count: Int, pairs: Boolean = true) {
    var nombre = if (pairs) 0 else 1
    var compteur = 0

    println("Les $count premiers nombres ${if (pairs) "pairs" else "impairs"} sont:")
    while (compteur < count) {
        print("$nombre ")
        nombre += 2
        compteur++
    }
    println()
}
// Exemple d application
afficherNombres(10,false)

// 0,1,1,2,3,5,7
fun afficherNombresFibonacci(count: Int) {
    var nombre0 = 0
    var nombre1 = 1
    var compteur = 0

    while (compteur < count ){
        print("$nombre0,")
        print("$nombre1,")
        nombre0 = nombre1 + nombre0
        nombre1 = nombre0 + nombre1
        compteur++
    }
    println()
}
// exemple d' application
afficherNombresFibonacci(5)

fun calculFactoriel(x:Int = 10): Long {
    var res = 1L
    if (x >0)
    for (i in 1..x) {
        res *= i
    }
    return res

}
calculFactoriel(0)
// On va créer une fonction pour savoir qui est un premier oi pas
fun estPremier(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun nombresPremiers(count: Int) {
    if (count <= 0) return

    var nombreTrouve = 0
    var nombre = 2

    while (nombreTrouve < count) {
        if (estPremier(nombre)) {
            print("$nombre ")
            nombreTrouve++
        }
        nombre++
    }
    println()
}
nombresPremiers(11)