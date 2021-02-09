package builder

class Food private constructor(builder: Builder) {

    val infoFood = InfoFood()

    init {
        infoFood.bread = builder.infoFood.bread
        infoFood.condiments = builder.infoFood.condiments
        infoFood.meat = builder.infoFood.meat
        infoFood.fish = builder.infoFood.fish
    }

    class Builder {

        val infoFood = InfoFood()

        fun bread(bread: String) = apply { infoFood.bread = bread }
        fun condiments(condiments: String) = apply { infoFood.condiments = condiments }
        fun meat(meat: String) = apply { infoFood.meat = meat }
        fun fish(fish: String) = apply { infoFood.fish = fish }
        fun build() = Food(this)

    }

}
//more improvments
class InfoFood {
    var bread: String? = null
    var condiments: String? = null
    var meat: String? = null
    var fish: String? = null
}
