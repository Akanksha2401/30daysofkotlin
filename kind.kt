package example.myapp

//creating class with classname as Aquarium
//class Aquarium contains changeable properties i.e, why it is initialised as var.

// Kotlin automatically creates getters and setters for the properties you defined
// in the Aquarium class, so you can access the properties directly, for example, myAquarium.length

//Note: If you declared these properties with val instead of var, the properties would be immutable.
// You could only set them once, and all the instances of Aquarium would have the same dimensions.

//If your constructor needs more initialization code, it can be placed in one or more init blocks.
// In this step, you add some init blocks to Aquarium class

//class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    //var width: Int = 20
    //var height: Int = 40
    //var length: Int = 100

    //fun printSize() {
        //println("Width: $width cm " +
                //"Length: $length cm " +
               // "Height: $height cm ")
  //  }
//}

class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
    init {
        var width: Int = 20
        var height: Int = 40
        var length: Int = 100
        println("Volume: ${width * length * height / 1000} l")
    }

    //secondary //constructor
    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }

}