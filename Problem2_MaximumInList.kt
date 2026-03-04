fun main() {
    // Example list of integers
    val numbers = listOf(45, 12, 89, 23, 67, 34, 91, 56)
    
    // Find maximum number
    val maximum = findMaximum(numbers)
    
    println("List: $numbers")
    println("Maximum number: $maximum")
}

fun findMaximum(numbers: List<Int>): Int {
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("List cannot be empty")
    }
    
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}
