fun main() {
    // Example strings
    val testStrings = listOf(
        "Hello World",
        "Kotlin Programming",
        "AEIOU",
        "xyz"
    )
    
    println("Vowel Counter:")
    println()
    
    for (text in testStrings) {
        val vowelCount = countVowels(text)
        println("String: \"$text\"")
        println("Number of vowels: $vowelCount")
        println()
    }
}

fun countVowels(text: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var count = 0
    
    for (char in text) {
        if (char in vowels) {
            count++
        }
    }
    
    return count
}
