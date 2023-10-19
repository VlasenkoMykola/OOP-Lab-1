package OOP_lab1;

public class FoodCalories {
    private Integer calories_number = 0;

    public FoodCalories(String foodName, Integer calories_number){
        this.calories_number = calories_number;
    }
    public Integer getcalories_number() {return calories_number;}

    public void setcalories_number(Integer calories_number) {
        if(calories_number >= 0) this.calories_number = calories_number;
        else System.out.println("Incorrect value. (setcalories_number(Integer calories_number))");
    }
}
