package OOP_lab1;

import java.util.List;

public class SaladSystem {
    private static final String TOTAL_CALORIES = "Total calories of all food ingredients: ";
    private Double calories = 0.0;

    public void getFoods(List<Food> foods) {
        for(Food food : foods)
            System.out.println(food.toString());
        System.out.println();
    }

    public void getTotalCalories(List<Food> foods){
        System.out.println("Get total calories method.");
        Integer caloriescalories_number = 0;
        for(int i = 0; i < foods.size(); i++) {
            caloriescalories_number += foods.get(i).getFoodCalories().getcalories_number();
        }
        FoodCalories buff = new FoodCalories("totalcalories", caloriescalories_number);
        System.out.println(TOTAL_CALORIES + buff.toString() + '\n');
    }

    public void sortingByColor(List<Food> foods, FoodColor color){
        System.out.println("\nSorting by Style method.");
        for(Food food : foods) {
            if (food.getFoodColor() == color)
                System.out.println(food.toString());
        }
        for(Food food : foods) {
            if(food.getFoodColor() != color)
                System.out.println(food.toString());
        }
        System.out.println();
    }

    public void findByRange(FoodCalories min, FoodCalories max, List<Food> foods){
        System.out.println("Find by Range method.");
        Boolean isEmpty = true;
        for(int i = 0; i < foods.size(); i++){

            Integer foodToFind = foods.get(i).getFoodCalories().getcalories_number();

            if(foodToFind >= min.getcalories_number() && foodToFind <= max.getcalories_number()) {
                System.out.println(foods.get(i).toString());
                isEmpty = false;
            }
        }
        if(isEmpty){
            System.out.println("There are no such foods that would satisfy the condition (>" + min.toString() + ", <" + max.toString() + ")");
        }
    }
}
