package design.bridge;

/**
 * Created by chenzhangyan on 2018/4/6.
 */
public abstract class People {
    public DreamApi dreamApi;

    public People(DreamApi dreamApi) {
        this.dreamApi = dreamApi;
    }

    public abstract void work();
}
