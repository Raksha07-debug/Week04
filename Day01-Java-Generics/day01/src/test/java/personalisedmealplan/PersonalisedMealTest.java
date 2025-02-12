package personalisedmealplan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import personalisedmealplangenerator.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonalisedMealTest {
    @Test
    void testVegetarianMeal(){
        Vegetarian vegetarianMeal=new Vegetarian();
        assertEquals("Vegetarian Meal: Includes vegetables, fruits, grains, and dairy.",vegetarianMeal.getMealPlan());
    }
    @Test
    void testVegan(){
        Vegan veganMeal=new Vegan();
        assertEquals("Rich in fibers and protein",veganMeal.getMealPlan());

    }
    @Test
    void  testKeto(){
        Keto keto= new Keto();
        assertEquals("Keto Meal: High in fats, low in carbohydrates, and moderate in proteins.",keto.getMealPlan());
    }
    @Test
    void  testHighProtein(){
        HighProtein highProtein=new HighProtein();
        assertEquals("High Protein Meal: Rich in protein sources like lean meats, beans, and legumes.",highProtein.getMealPlan());
    }
    @Test
    void testMeal() {
        Vegetarian vegetarianMeal = new Vegetarian();
        Meal<Vegetarian> meal = new Meal<>(vegetarianMeal);
        assertEquals(vegetarianMeal, meal.getMealPlan());
        meal.displayMealPlan();
    }
    @Test
    void testUtility() {
        Vegetarian vegetarianMeal = new Vegetarian();
        Vegan veganMeal = new Vegan();
        Keto ketoMeal = new Keto();
        HighProtein highProteinMeal = new HighProtein();

        List<MealPlan> mealList = List.of(vegetarianMeal, veganMeal, ketoMeal, highProteinMeal);
        List<Meal<? extends MealPlan>> validMealPlans = Utility.generateMeal(mealList);

        assertEquals(4, validMealPlans.size());
    }
}
