package personalisedmealplangenerator;

public class Meal <T extends MealPlan>{
    T mealPlan;

    public Meal(T mealPlan){
        this.mealPlan=mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
    public void displayMealPlan(){
        System.out.println(mealPlan.getMealPlan());
    }
}
