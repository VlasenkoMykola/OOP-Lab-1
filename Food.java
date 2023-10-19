package OOP_lab1;

public class Food {
    private String foodName;
    private FoodCalories foodCalories;
    private FoodColor foodColor;

    public Food(String foodName, Integer foodCaloriesNumber, FoodColor foodColor){
        this.foodName = foodName;
        this.foodCalories = new FoodCalories(this.foodName ,foodCaloriesNumber);
        this.foodColor = foodColor;
    }

    public String getFoodName(){return foodName;}
    public FoodCalories getFoodCalories(){return foodCalories;}
    public FoodColor getFoodColor(){return foodColor;}

    public void setFoodName(String foodName) {this.foodName = foodName;}
    public void setFoodCalories(Integer foodCaloriesNumber) {
        foodCalories.setcalories_number(foodCaloriesNumber);
    }
    public void setFoodColor(FoodColor foodColor) {this.foodColor = foodColor;}

    public String toString(){
        return "Food Name: " + getFoodName() + ", Calories: " + foodCalories.getcalories_number() + ", Color: " + getFoodColor();
    }
}
