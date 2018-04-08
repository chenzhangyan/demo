package design.proxy;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class DrawerProxy implements Draw {
    private Drawer drawer;

    public void draw() {
        if (drawer == null) {
            drawer = new Drawer();
        }
        drawer.draw();
    }
}
