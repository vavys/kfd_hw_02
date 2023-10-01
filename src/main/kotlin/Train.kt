class Train(
    override val size: String,
    override val price: Int,
    override val name: String
): Transport(), engine {
    fun ConnectWagons(){
        println("wagons connected")
    }
}