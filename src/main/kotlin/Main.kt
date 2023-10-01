fun main() {
    val car1 = Car("small", 1000, "car1", 1.6f)
        println("${car1.name}:")
        car1.RunEngine()
        car1.DriveCar()
    val plane1 = Airplane("medium", 10000, "plane1")
        println("${plane1.name}:")
        plane1.ReleaseChassis()
        plane1.RunEngine()
    val train1 = Train("big", 20000, "train1")
        println("${train1.name}:")
        train1.ConnectWagons()
        train1.RunEngine()
    val cyclops = Boat("big", 30000, "mycyclops")
        println("${cyclops.name}:")
        cyclops.RunEngine()
        cyclops.diving()



}