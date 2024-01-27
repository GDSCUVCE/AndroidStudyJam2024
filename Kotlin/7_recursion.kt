// implement a recursive function called factorial that calculates the factorial of a given non-negative integer.

// implement your function here
fun factorial(number: Int):Int{
    return if(number == 0 || number == 1){
        1
    }
    else
    {
        return (number)*factorial(number - 1)
    }
}

fun main() {
    val result = factorial(5)
    println(result)
}

// function that calls itself is called recursive function
