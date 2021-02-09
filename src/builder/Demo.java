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
        FoodK2 foodK2 = new FoodK2.Builder("ID-12")
                .bread("")
                .condiments("")
                .fish("")
                .meat("")
                .build();

        foodK2.getInfoFood().getFish();

    }
}
//..................................................
//Flexibility and Readability of Code
// Handle Complex parameters and Multiple Constructor
// build a valid instance of Model by validate in Builder
// seperate and decouple the Construction from Representation
// make parameters to be manageable
// control about optional and Mandatory fields from One Builder
//
//.............................
//setter injector is good but it may create invalid  object of The Model (correct syntax but wrong valid object)

//https://www.developer.com/java/data/implementing-builder-patterns-in-java.html
//https://www.baeldung.com/kotlin/builder-pattern
//https://sourcemaking.com/design_patterns/builder
//https://sourcemaking.com/design_patterns/builder/java/1
