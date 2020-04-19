package beyondBasics.extensionFunctions

import kotlin.random.Random

//Extension functions increase the capabilities of a class.
//They are written when addition of those functions to the class doesn't add to the core functionality of the class.
class Book(var pages: Int)

fun Book.tornPages(torn: Int) {
    this.pages -= torn
};

val Book.weight: Double
    get() = this.pages * 1.5

class Puppy(){
    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(50))
    }
}

fun main() {
    val puppy = Puppy()
    val book = Book(400)
    puppy.playWithBook(book)
    println(book.pages)
}

//Four points here
//Write extension functions
//Limitations of extension function: you can only operate on the public properties of the class
//Write extension properties

//Know about nullable receivers
//receiver is the class you're trying to extend. Nullable receivers ensures that your extension function can handle
//being called on by a null object