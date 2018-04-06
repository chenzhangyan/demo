package design.adapter;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class MealAdapter implements AutoMeal {
    Meal meal;

    public MealAdapter(String name) {
        if ("breakfast".equalsIgnoreCase(name)) {
            meal = new BreakfastAdapter();
        } else if ("lunch".equalsIgnoreCase(name)) {
            meal = new LunchAdapter();
        } else if ("dinner".equalsIgnoreCase(name)) {
            meal = new DinnerAdapter();
        }
    }


    public void eat(String name) {
        if ("breakfast".equalsIgnoreCase(name)) {
            meal.breakfast();
        } else if ("lunch".equalsIgnoreCase(name)) {
            meal.lunch();
        } else if ("dinner".equalsIgnoreCase(name)) {
            meal.dinner();
        } else {
            System.out.println("eat-nothing");
        }
    }
}
