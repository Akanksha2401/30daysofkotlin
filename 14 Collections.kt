// This sums up all the elements.

val list = listOf(1, 5, 3, 4)
println(list.sum())

val list2 = listOf("a", "bbb", "cc")
println(list2.sum())
//error: none of the following functions can be called with the arguments supplied:

val list2 = listOf("a", "bbb", "cc")
println(list2.sumBy { it.length })
//length is traversed

//iteration

val list2 = listOf("a", "bbb", "cc")
for (s in list2.listIterator()) {
    println("$s ")
}

//
//hash maps
//

val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

// retrieve the disease value based on the symptom key, using get()

println(cures.get("white spots"))

println(cures.get("white spots"))
