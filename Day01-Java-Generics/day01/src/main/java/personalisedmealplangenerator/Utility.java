package personalisedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class Utility {
    public static <T extends MealPlan> boolean isValidMeal(T mealPlan){
        return  mealPlan!=null;
    }
    public static List<Meal<? extends  MealPlan>> generateMeal(List<? extends MealPlan> mealPlans){
        List<Meal<? extends MealPlan>> validMeal= new ArrayList<>();
        for (MealPlan mealPlan : mealPlans) {
            // Check if the meal plan is valid
            if (isValidMeal(mealPlan)) {
                // Add the valid meal plan to the list
                validMeal.add(new Meal<>(mealPlan));
            }
        }
        return validMeal;
    }
}
