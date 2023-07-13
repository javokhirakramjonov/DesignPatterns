import java.util.ArrayList;
import java.util.List;

public class BuilderPattern {
    public static void main(String[] args) {
        Lunch lunch = new Lunch
                .Builder()
                .addDrink(new Tea())
                .addDessert(new Dessert())
                .build();
    }
}

class FirstFood {
}

class SecondFood {
}

class Drink {
}

class Tea extends Drink {

}

class Dessert {
}

class Lunch {
    private final List<FirstFood> firstFoods;
    private final List<SecondFood> secondFoods;
    private final List<Drink> drinks;
    private final List<Dessert> desserts;

    public Lunch(List<FirstFood> firstFoods, List<SecondFood> secondFoods, List<Drink> drinks, List<Dessert> desserts) {
        this.firstFoods = firstFoods;
        this.secondFoods = secondFoods;
        this.drinks = drinks;
        this.desserts = desserts;
    }

    static class Builder {
        private List<FirstFood> firstFoods;
        private List<SecondFood> secondFoods;
        private List<Drink> drinks;
        private List<Dessert> desserts;

        public Builder() {
            this.firstFoods = new ArrayList<>();
            this.secondFoods = new ArrayList<>();
            this.drinks = new ArrayList<>();
            this.desserts = new ArrayList<>();
        }

        Builder addFirstFood(FirstFood firstFood) {
            this.firstFoods.add(firstFood);
            return this;
        }

        Builder addSecondFood(SecondFood secondFood) {
            this.secondFoods.add(secondFood);
            return this;
        }

        Builder addDrink(Drink drink) {
            this.drinks.add(drink);
            return this;
        }

        Builder addDessert(Dessert dessert) {
            this.desserts.add(dessert);
            return this;
        }

        Lunch build() {
            return new Lunch(
                    this.firstFoods,
                    this.secondFoods,
                    this.drinks,
                    this.desserts
            );
        }
    }
}
