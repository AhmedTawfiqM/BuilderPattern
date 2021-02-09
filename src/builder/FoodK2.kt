package builder

//Best Practice in Kotlin
data class FoodK2(
    val infoFood: InfoFood
) {

    class Builder {
        val infoFood = InfoFood()

        fun bread(bread: String) = apply { infoFood.bread = bread }
        fun condiments(condiments: String) = apply { infoFood.condiments = condiments }
        fun meat(meat: String) = apply { infoFood.meat = meat }
        fun fish(fish: String) = apply { infoFood.fish = fish }
        fun build() {
            if (infoFood.bread != "")
                FoodK2(infoFood)
            else throw IllegalStateException("can't create Valid Object")
        }
    }
}