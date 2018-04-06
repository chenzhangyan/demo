package design.prototype;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class Demo {
    public static void main(String[] args) {
        ProtoCache.loadCache();
        Fruit pear = ProtoCache.getFruit("pear");
        System.out.println(pear.getName() + "是" + pear.getShape().name() + "的");
        Fruit apple = ProtoCache.getFruit("apple");
        System.out.println(apple.getName() + "是" + apple.getShape().name() + "的");
    }
}
