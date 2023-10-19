package OOP_lab1;

import static OOP_lab1.FoodColor.*;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private List<Food> food_ingredients = new ArrayList<>();
    private SaladSystem system = new SaladSystem();

    public Salad() {
        food_ingredients.add(new Food("Нарізана Картопля", 100, YELLOW));
        food_ingredients.add(new Food("Редька", 15, WHITE));
        food_ingredients.add(new Food("Помідор", 25, RED));

        system.getFoods(food_ingredients);
        system.getTotalCalories(food_ingredients);
        system.sortingByColor(food_ingredients, YELLOW);
        FoodCalories min = new FoodCalories("minCalories",10);
        FoodCalories max = new FoodCalories("maxCalories",30);
        system.findByRange(min, max, food_ingredients);
    }
}
