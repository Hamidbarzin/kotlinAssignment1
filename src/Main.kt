// Main.kt

// A. Function to sum integers from 1 to a specified maximum
fun sumUpTo(max: Int): Int {
    var sum = 0
    for (i in 1..max) {
        sum += i
    }
    return sum
}

// B. Iterative function to calculate factorial of a specified integer
fun factorialIterative(n: Int): Int {
    if (n < 0) throw IllegalArgumentException("Factorial is not defined for negative numbers.")
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

// C. Lambda expression for calculating factorial
val factorialLambda: (Int) -> Int = { n ->
    if (n < 0) throw IllegalArgumentException("Factorial is not defined for negative numbers.")
    (1..n).reduce { acc, i -> acc * i }
}

// D. Recursive function to calculate factorial of a specified integer
fun factorialRecursive(n: Int): Int {
    if (n < 0) throw IllegalArgumentException("Factorial is not defined for negative numbers.")
    return if (n <= 1) 1 else n * factorialRecursive(n - 1)
}

// Main function to test the implementations
fun main() {
    val maxSum = 10
    println("Sum from 1 to $maxSum: ${sumUpTo(maxSum)}")

    val number = 5
    println("Factorial of $number (Iterative): ${factorialIterative(number)}")
    println("Factorial of $number (Lambda): ${factorialLambda(number)}")
    println("Factorial of $number (Recursive): ${factorialRecursive(number)}")
}}