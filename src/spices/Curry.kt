package spices

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        println("preparing Curry")
    }

    override fun grind() {
        println("Curry can be ground")
    }
}