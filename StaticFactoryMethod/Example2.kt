/**
 * Static Factory Method
 * Advantages stylish:[naming, expect exceptions]
 * Advantages tech: [caching, subclassing]
 */

fun main() {

    val uzbekCar = Car.createUzbekCar("Gentra")
    val europeCar = Car.createEuropeCar("Mercedes")

    val cars = listOf(uzbekCar, europeCar)

    cars.forEach(::println)

}

abstract class Car(name: String) {
    companion object {


        fun createUzbekCar(name: String): Car {
            return UzbekCar(name)
        }

        fun createEuropeCar(name: String): Car {
            return EuropeCar(name)
        }
    }
}

class UzbekCar(private val name: String) : Car(name) {
    override fun toString(): String {
        return "This is uzbek car with name $name"
    }
}

class EuropeCar(private val name: String) : Car(name) {
    override fun toString(): String {
        return "This is europe car with name $name"
    }
}
