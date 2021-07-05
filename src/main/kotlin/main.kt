fun main(args: Array<String>) {
    print("Alphabet without vowel letters \n")
    print(vowels("all vowel letters are missing"))
}

fun vowels(writeup: String): String {
    val remove = StringBuilder()
    for (i in writeup) {
        if (i != 'a' && i != 'e' && i != 'i' &&
            i != 'o' && i != 'u' && i != 'A' &&
            i != 'E' && i != 'I' && i != 'O' && i != 'U'
        ) {
            remove.append(i)
        }
    }
    return remove.toString()
}
