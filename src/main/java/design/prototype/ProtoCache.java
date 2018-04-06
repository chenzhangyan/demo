package design.prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class ProtoCache {
    private static HashMap<String, Fruit> cache = new HashMap<String, Fruit>();

    public static Fruit getFruit(String name) {
        Fruit cachedFruit = cache.get(name);
        if (cachedFruit == null) {
            return null;
        }
        return (Fruit) cachedFruit.clone();
    }

    public static void loadCache() {
        Apple apple = new Apple();
        apple.setName("富士苹果");
        cache.put("apple", apple);
        Pear pear = new Pear();
        pear.setName("鸭梨");
        cache.put("pear", pear);
    }
}
