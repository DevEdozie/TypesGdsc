class Person(val name: String,var weightLbs: Double) {
    var weightKilos: Double
        get() = weightLbs / 2.2
        set(value) {
            weightLbs = value * 2.2
        }
}

fun main(args: Array<String>) {
    val p = Person("Bob", 176.0)
    val name = p.name //Bob
    val lbs = p.weightLbs //176.0
    val kilos = p.weightKilos
    /*
    weightLbs / 2.2
    176.0 / 2.2 = 80.0
     */
//    val name = p.name
//
//    p.weightLbs = 220.0
//    //set
//    val kilos = p.weightKilos
//    println("Kilos: $kilos") // 220.0 / 2.2 = 100
//
//    /*
//    weightLbs = 50.0 * 2.2 = 110
//     */
//    p.weightKilos = 50.0
//    val lbs = p.weightLbs // 110
//    println("Lbs: $lbs")

}