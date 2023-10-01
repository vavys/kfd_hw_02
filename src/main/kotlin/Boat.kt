class Boat(
    override val size: String,
    override val price: Int,
    override val name: String
): Transport(), engine {
    fun diving(){
        println("boat is diving")
    }
}