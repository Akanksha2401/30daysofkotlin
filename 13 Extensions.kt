val equipment = "fish net" to "catching fish"
println("${equipment.first} used for ${equipment.second}")

//Create a triple and print it with toString(), then convert it to a list with toList(). 
//You create a triple using Triple() with 3 values. Use .first, .second and .third to refer to each value.

val numbers = Triple(6, 9, 42)
println(numbers.toString())
println(numbers.toList())

val equipment2 = ("fish net" to "catching fish") to "equipment"
println("${equipment2.first} is ${equipment2.second}\n")
println("${equipment2.first.second}")

//Separating pairs and triples into their parts is called destructuring.
//Assign the pair or triple to the appropriate number of variables,
//and Kotlin will assign the value of each part in order.

//Destructure a pair and print the values.

val equipment = "fish net" to "catching fish"
val (tool, use) = equipment
println("$tool is used for $use")

//Destructure a triple and print the values.

val numbers = Triple(6, 9, 42)
val (n1, n2, n3) = numbers
println("$n1 $n2 $n3")
