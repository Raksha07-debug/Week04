package personalisedmealplangenerator;

public class Vegetarian implements  MealPlan{
    @Override
    public String getMealPlan() {
        return "Vegetarian Meal: Includes vegetables, fruits, grains, and dairy.";
    }
}
