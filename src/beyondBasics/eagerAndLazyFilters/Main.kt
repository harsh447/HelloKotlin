package beyondBasics.eagerAndLazyFilters

fun main() {
    //lazy and eager filters
    //Lazy filters can be made using Sequence which is a type of Collection that can only look at one element at a time
    //Starting from the first and going on till the end.
    val decorations = listOf(
        "rock", "pagoda", "plastic plant", "alligator", "flowerpot"
    )

    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    val lazy = decorations.asSequence().filter { it[0] == 'p' }
    println(lazy)

    //lazy holds the sequence of list elements and the filter knowledge.
    //This knowledge will only be applied when you access a certain element

    //To force the evaluation of the sequence, use the toList
    val newList = lazy.toList()

    //To visualize what's going on we can use the map() function
    //map() function is used for transformation
    val lazyMap = decorations.asSequence().map {
        println("accessing: $it")
        it
    }

    println("----")
    println("----")
    println("lazy: $lazyMap")
    println("----")
    println("first: ${lazyMap.first()}")
    println("----")
    println("all: ${lazyMap.toList()}")
}