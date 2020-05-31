//DATA CLASS

//A data class is similar to a struct in some other languages—it exists mainly to hold some data—but a data class object is still an object.
// Kotlin data class objects have some extra benefits, such as utilities for printing and copying.
// In this task, you create a simple data class and learn about the support Kotlin provides for data classes.


package example.myapp.decor

data class Decoration(val rocks: String){

}
fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println (decoration1.equals(decoration2))
    println (decoration3.equals(decoration2))

    //To get at the properties of a data object and assign them to variables,
    // you could assign them one at a time, like this.

    //val rock = decoration.rock
    //val wood = decoration.wood
    //val diver = decoration.diver

}

data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations2() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

fun main(){
    makeDecorations()
    makeDecorations2()
}