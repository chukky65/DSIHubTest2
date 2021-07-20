fun main() {
    val list: List<Int> = listOf(3, 5, 9, 2)
    print(reverseNum(list))
}

fun reverseNum(list: List<Int>): List<Int> {
    val filo = arrayListOf<Int>()
    for (i in list.indices) {
        val nums = list[list.size - 1 - i]
        filo.add(nums)
    }
    return filo
}