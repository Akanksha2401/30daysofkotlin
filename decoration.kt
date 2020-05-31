//Enums are a bit like singletons—there can be only one, and only one of each value in the enumeration.
// For example, there can only be one Color.RED, one Color.GREEN, and one Color.BLUE.
// In this example, the RGB values are assigned to the rgb property to represent the color components.
// You can also get the ordinal value of an enum using the ordinal property, and its name using the name property.

package example.myapp.decor

data class Decoration(val rocks: String){

}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    println(Direction.EAST.name)
    // You can also get the ordinal value of an enum using the ordinal property,
    // and its name using the name property.
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}