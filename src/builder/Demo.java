package builder;

public class Demo {

    public static void main(String[] args) {

        //java or kotlin
        Food food = new Food.Builder()
                .bread("")
                .condiments("")
                .fish("")
                .meat("")
                .build();

        //full advantage of Kotlin
        FoodK foodK = new FoodK.Builder()
                .bread("")
                .condiments("")
                .fish("")
                .meat("")
                .build();

        //AT Best Practice
        FoodK2 foodK2 = new FoodK2.Builder()
                .bread("")
                .condiments("")
                .fish("")
                .meat("")
                .build();

        foodK2.getInfoFood().getFish();

    }
}
//https://www.baeldung.com/kotlin/builder-pattern
//https://sourcemaking.com/design_patterns/builder
//https://sourcemaking.com/design_patterns/builder/java/1
