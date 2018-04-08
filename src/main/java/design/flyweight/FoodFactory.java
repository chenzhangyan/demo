package design.flyweight;

import java.util.HashMap;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class FoodFactory {
    private static final HashMap<String, Food> fruitMap = new HashMap<String, Food>();

    public static Food getFruit(String name) {
        Fruit fruit = (Fruit) fruitMap.get(name);
        if (fruit == null) {
            fruit = new Fruit();
            fruit.setName(name);
            fruitMap.put(name, fruit);
        }
        return fruit;
    }

}
