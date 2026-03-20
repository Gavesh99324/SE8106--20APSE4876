fun main() {
    // Example list with duplicates
    val numbersWithDuplicates = listOf(1, 2, 3, 2, 4, 5, 3, 6, 1, 7, 4, 8)
    
    // Remove duplicates
    val uniqueNumbers = removeDuplicates(numbersWithDuplicates)
    
    println("Original list: $numbersWithDuplicates")
    println("List without duplicates: $uniqueNumbers")
    println("Original size: ${numbersWithDuplicates.size}")
    println("New size: ${uniqueNumbers.size}")
}

fun removeDuplicates(numbers: List<Int>): List<Int> {
    val uniqueList = mutableListOf<Int>()
    
    for (number in numbers) {
        if (number !in uniqueList) {
            uniqueList.add(number)
        }
    }
    
    return uniqueList
}
