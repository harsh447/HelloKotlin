package spicesClasses

fun main() {
    val simpleSpice = SimpleSpice();
    println("Name of the spice is ${simpleSpice.name} and its heat level is ${simpleSpice.heat}.")

    val spicesList = listOf(
        Spice("pepper", "medium"),
        Spice("rock salt"),
        Spice("red chili", "spicy")
    )

    makeSalt()

    val mediumOrLessList = spicesList.filter { it.heat <= 6 }
    val spicyList = spicesList.filter { it.heat > 7 }
    println("Medium spicy list: $mediumOrLessList")
    println(spicyList.toString())
}

fun makeSalt() = Spice("salt")