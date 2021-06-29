fun main(){
    println(evenlySpaced(2,4,6))

}

fun evenlySpaced(a: Int, b: Int, c: Int): Boolean{
    var firstDif: Int = a - b
    var secondDif: Int = b - c
    return firstDif == secondDif



}

