fun main() {
    // Example list of integers
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    // Calculate sum of even numbers
    val sumOfEvens = sumOfEvenNumbers(numbers)
    
    println("List: $numbers")
    println("Sum of even numbers: $sumOfEvens")
}

fun sumOfEvenNumbers(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}
