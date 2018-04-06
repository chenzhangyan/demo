package design.bridge;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public class Child extends People {
    public Child(DreamApi dreamApi) {
        super(dreamApi);
    }

    public void work() {
        dreamApi.work();
    }
}
