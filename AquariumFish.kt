package example.myapp

//A sealed class is a class that can be subclassed,
// but only inside the file in which it's declared.
// If you try to subclass the class in a different file, you get an error.
sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}

//The Seal class can't be subclassed in another file.
// If you want to add more Seal types, you have to add them in the same file.
// This makes sealed classes a safe way to represent a fixed number of types.
// For example, sealed classes are great for returning success or error from a network API.