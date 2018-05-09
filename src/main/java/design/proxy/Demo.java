package design.proxy;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class Demo {
    public static void main(String[] args) {
        Draw drawerProxy = new DrawerProxy();
        drawerProxy.draw();
        drawerProxy.draw();
        drawerProxy.draw();

        DynamicProxy dynamicProxy = new DynamicProxy();
        Draw draw = (Draw) dynamicProxy.bind(new Drawer());
        draw.draw();
    }
}
