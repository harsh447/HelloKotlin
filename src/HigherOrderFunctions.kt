fun main() {
    val dirtyLevel = 20

    //Here we've created a lambda
    val waterFilter = { dirty: Int -> dirty / 2 }

    //Here is a syntax for function type, which is very much like the lambda syntax
    //Use this syntax to cleanly indicate that a variable is holding a function
    val waterFilter2: (Int) -> Int = { dirty -> dirty/2 }

    println(updateDirty(dirtyLevel, waterFilter))
    println(updateDirty(dirtyLevel, waterFilter2))

    //The usage of the :: operator indicates the intention to pass the function as a reference and not call the function
    println(updateDirty(dirtyLevel, ::increaseDirty))

    //Kotlin prefers that if a function does accept a higher-order function then its best if that is the last parameter
    //because Kotlin has a special syntax in that case called the 'Last Parameter Call Syntax'
    println(updateDirty(dirtyLevel) {
        it * 4
    })
}

fun increaseDirty(dirty: Int) = dirty + 1

//Here is a higher order function
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}