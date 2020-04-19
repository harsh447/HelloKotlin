package beyondBasics.collections

fun main() {
    val allBooksByShakespeare = setOf<String>("Hamlet", "Othello")
    val library = mapOf<String, Set<String>>(
        "William Shakespeare" to allBooksByShakespeare
    )
    println(library.any {
        it.value.contains("Hamlet")
    })

    val moreBooks = mutableMapOf<String, String>(
        "Shakespeare" to "Hamlet"
    )
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    println(moreBooks)
}