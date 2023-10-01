class Car(
    override val size: String,
    override val price: Int,
    override val name: String,
    val EngineVolume: Float
): Transport(), engine{
    fun DriveCar(){
        println("$name is driving")
    }
}
