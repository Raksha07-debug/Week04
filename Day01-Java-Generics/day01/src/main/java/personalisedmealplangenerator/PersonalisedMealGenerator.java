package personalisedmealplangenerator;

import jdk.jshell.execution.Util;

import java.util.List;

public class PersonalisedMealGenerator {
    public static void main(String[] args) {
        HighProtein highProtein=new HighProtein();
        Keto ketoMeal=new Keto();
        Vegan veganMeal=new Vegan();
        Vegetarian vegetarianMeal=new Vegetarian();

        List<MealPlan> mealList = List.of(vegetarianMeal, veganMeal, ketoMeal, highProtein);
        List<Meal<? extends MealPlan>> mealList2= Utility.generateMeal(mealList);
        for (Meal<? extends MealPlan> meal : mealList2) {
            meal.displayMealPlan();
        }

    }
}
