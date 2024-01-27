// Create a function called printInfo that takes a name and an age as parameters. Age should have a default value of 25. Print the information.

// you function here
fun printInfo(name: String, age: Int = 25){
    println("Name: $name, Age: $age)
}


fun main() {
    printInfo("Alice")
    printInfo("Bob", 30)
}

// to give default values just initialize the variable in the parameter itself 
// ex : salary : Int = 500000
