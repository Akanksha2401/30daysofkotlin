fun main() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})

    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it

    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")


    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel = 19;
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)

}
