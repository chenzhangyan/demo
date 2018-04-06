package design.bridge;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class Demo {
    public static void main(String[] args) {
        People singer = new Child(new Singer());
        People chief = new Child(new Chief());
        singer.work();
        chief.work();
    }
}
