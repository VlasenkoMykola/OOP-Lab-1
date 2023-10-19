package com.music_edu.music;

import org.junit.jupiter.api.Test;

import OOP_lab1.FoodCalories;

class FoodCaloriesTest {
    FoodCalories foodCaloriesTest = new FoodCalories("FoodCaloriesTest",15);
    @Test
    void getCalories() {
        foodCaloriesTest.getcalories_number();
    }
    @Test
    void setCalories() {
        foodCaloriesTest.setcalories_number(1);
    }
    @Test
    void testToString() {
        foodCaloriesTest.toString();
    }
}