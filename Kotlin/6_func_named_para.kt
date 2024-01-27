// Create a function called displayPerson that takes two parameters: name and age. Call the function with named parameters, swapping their order.

// in your function, declare name first then age
fun displayPerson(name: String, age: Int){
    println("Name: $name, Age: $age")
            }
    

fun main() {

    displayPerson(age = 25, name = "Charlie")
    
}

// when you specifically use the name of the parameter, you can use it in any order, you cannot do this in c++ or java
