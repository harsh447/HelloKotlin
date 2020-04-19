package beyondBasics.pairsAndTriple

class Book(val title: String, val author: String, val year: String)
{
    //getTitleAuthor() and getTitleAuthorYear() belong here
}

fun main() {
    val (title, author) = getTitleAuthorPair()
    val titleAuthor = getTitleAuthorPair()
    println("book $title written by $author")
    println("book ${titleAuthor.first} written by ${titleAuthor.second}")
}

fun getTitleAuthorPair(): Pair<String, String> {
    return "Pragmatic Programmer" to "Andy and Dave"
}

fun getTitleAuthorYearTriple(): Triple<String, String, String> {
    return Triple("Pragmatic Programmer", "Andy and Dave", "2010")
}