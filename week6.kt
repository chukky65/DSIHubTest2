fun main(args: Array<String>) {
    println(inLove(4, 5))
}

fun inLove(guy: Int, babe: Int): Boolean {
    var firstPetal = guy % 2 == 0
    var secondPetal = babe % 2 == 1

    return firstPetal == secondPetal
}