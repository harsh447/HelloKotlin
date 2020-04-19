package beyondBasics.constants

const val MAX_BOOKS_ALLOWED = 5

fun canBorrow(hasBooks: Int) = hasBooks < MAX_BOOKS_ALLOWED

object Constants {
    const val BASE_URL = "https://www.turtlecare.net/"
}

//find out diff between companion object and object
//Companion objects constants are present in the static constructors of the class
//Object init happens lazily or on-demand
