package design.proxy;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class Drawer implements Draw {
    public Drawer() {
        getPencil();
    }

    private void getPencil() {
        System.out.println("get-pencil");
    }

    public void draw() {
        System.out.println("draw");
    }
}
