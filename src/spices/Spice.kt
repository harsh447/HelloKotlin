package spices

//We can replace the abstract keyword to sealed
//But then all the sub-classes would have to be in the same file i.e., this file
abstract class Spice(val name: String, private val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "medium" -> 6
                "spicy" -> 8
                else -> 0
            }
        }

    init {
        println("name of the spice is $name and its spiciness is $spiciness")
    }

    override fun toString(): String {
        return name
    }

    abstract fun prepareSpice()
}

//Check out the interface delegation that is done by the above class
//Interface delegation is a neat trick that allows you to delegate the interface implementation to some other object/class

//FYI
//Interface delegation is powerful, and you should generally consider how to use it whenever you might use an abstract
//class in another language. It lets you use composition to plug in behaviors, instead of requiring lots of subclasses, each
//specialized in a different way.

fun main() {
    val spiceCabinet = listOf(
        SpiceContainer(Curry("yellow curry", "mild")),
        SpiceContainer(Curry("red curry", "medium")),
        SpiceContainer(Curry("green curry", "spicy"))
    )

    for(container in spiceCabinet) println(container.label)
}