fun main() {
    println("FizzBuzz from 1 to 50:")
    println()
    
    for (i in 1..50) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("$i: Fizzbuzz")
            i % 3 == 0 -> println("$i: Fizz")
            i % 5 == 0 -> println("$i: Buzz")
            else -> println(i)
        }
    }
}
