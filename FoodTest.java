package OOP_lab1;

import static OOP_lab1.FoodColor.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {
    Food testFood = new Food("testFoodName",1, GREEN);

    @Test
    void getFoodName() {
        testFood.getFoodName();
    }

    @Test
    void getFoodCalories() {
        testFood.getFoodCalories();
    }

    @Test
    void getFoodColor() {
        testFood.getFoodColor();
    }

    @Test
    void setFoodName() {
        testFood.setFoodName("testFoodNameNew");
    }

    @Test
    void setFoodCalories() {
        testFood.setFoodCalories(5);
    }

    @Test
    void setFoodColor() {
        testFood.setFoodColor(BROWN);
    }

    @Test
    void testToString() {
        testFood.toString();
    }
}