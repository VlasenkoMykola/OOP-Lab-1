package OOP_lab1;

import OOP_lab1.Food;
import OOP_lab1.FoodCalories;
import OOP_lab1.FoodColor;

import static OOP_lab1.FoodColor.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class SaladTest {
    SaladSystem SaladSystemTest = new SaladSystem();
    List<Food> testFoods = new ArrayList<>();

    SaladTest() {
        // TOTAL DURATION IS 6:01
        testFoods.add(new Food("testFoodName1", 0, GREEN));
        testFoods.add(new Food("testFoodName2", 1, RED));
        testFoods.add(new Food("testFoodName3", 100, WHITE));
        testFoods.add(new Food("testFoodName4", 20, BROWN));
    }

    @Test
    void getFoods() {
        SaladSystemTest.getFoods(testFoods);
    }

    @Test
    void getTotalCalories() {
        SaladSystemTest.getTotalCalories(testFoods);
    }

    @Test
    void sortingByColor() {
        SaladSystemTest.sortingByColor(testFoods, BROWN);
    }

    @Test
    void findByRange() {
        FoodCalories min = new FoodCalories("minCalories",10);
        FoodCalories max = new FoodCalories("maxCalories",30);
        SaladSystemTest.findByRange(min,max, testFoods);
    }
}