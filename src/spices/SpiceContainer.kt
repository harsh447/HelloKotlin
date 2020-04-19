package spices

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

//More info on data classes
data class Decoration(val rocks: String)

//Fun and informative fact
//There are two types of equality, of course, but they're called
//Referential equality and Structural equality
//== for referential and equals() for structural
//In data classes though both == and equals perform structural equality checks
//To perform a referential check use the === operator

fun main() {
    val decoration1 = Decoration("granite")
    val decoration2 = Decoration("slate")
    val decoration3 = Decoration("slate")

    //use the copy() operator to duplicate a data object
    //although it only duplicates the properties in the primary constructor

    val decoration = Decoration2("crystal", "wood", "diver")
    //Destructuring a data class
    val (rock, wood, diver) = decoration

    //One could also do the following if only interested in getting a hold of certain properties
    val(rock_, _, diver_) = decoration
    println("The value held by rock_ is $rock_ and the value held by diver_ is $diver_")
}

data class Decoration2(val rocks: String, val wood: String, val diver: String)