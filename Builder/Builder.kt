fun main() {
    val lunch = Lunch(
            drinks = listOf(
                    Drink(),
                    Drink()
            ),
            desserts = listOf(
                    Dessert(),
                    Dessert(),
                    Dessert()
            )
    )

    println(lunch)
}


class FirstFood
class SecondFood
class Drink
class Dessert

data class Lunch(
        val firstFoods: List<FirstFood> = emptyList(),
        val secondFoods: List<SecondFood> = emptyList(),
        val drinks: List<Drink> = emptyList(),
        val desserts: List<Dessert> = emptyList()
)
