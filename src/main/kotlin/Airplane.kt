class Airplane(
    override val size: String,
    override val price: Int,
    override val name: String
): Transport(), engine {
    fun ReleaseChassis(){
        println("chassis released")
    }
}