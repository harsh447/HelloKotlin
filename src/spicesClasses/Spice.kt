package spicesClasses

class Spice(private val name: String, private val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when(spiciness){
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
}