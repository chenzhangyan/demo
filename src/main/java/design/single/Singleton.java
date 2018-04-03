package design.single;

/**
 * 饿汉式
 * 基于 classloder 机制避免了多线程的同步问题
 * 不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果
 *
 * @author chenzhangyan  on 2018/4/2.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
