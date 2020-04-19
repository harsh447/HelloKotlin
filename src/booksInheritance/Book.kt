package booksInheritance

open class Book(val title: String, val author: String) {
    private var currentPage = 1
    open fun readPage() {
        currentPage++;
    }
}