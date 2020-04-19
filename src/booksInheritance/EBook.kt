package booksInheritance

class EBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordsRead = 0
    override fun readPage() {
        wordsRead += 250
    }
}