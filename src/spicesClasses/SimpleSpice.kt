package spicesClasses

class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get() {
            if (spiciness == "mild") {
                return 5
            }
            return 0
        }

}

//property setter example
class SimpleSpice2 {
    val name: String = "curry"
    val spiciness: String = "mild"
    var heat: Int
        get() {
            if (spiciness == "mild") {
                return 5
            }
            return 0
        }
        //You can also add a property setter but this requires changing the val to var
        set(value) {
            //at this point the value of heat is modified to value
            //this block allows for some other kind of processing if needed
        }
    //if needed we can also add the modifier private to the setter.
    //That way outside code can only read the value.

}