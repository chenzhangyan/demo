package design.single;

/**
 * 静态内部类-进阶版
 *
 * @author chenzhangyan  on 2018/4/2.
 */
public class Singleton2 {
    private static class SingletonHolder {
        private static final Singleton2 instance = new Singleton2();
    }

    public static final Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
