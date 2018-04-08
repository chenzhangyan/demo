package design.responsibilitychain;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public abstract class AbstractChain {
    protected int level;
    protected AbstractChain nextChain;

    public void setNextChain(AbstractChain nextChain) {
        this.nextChain = nextChain;
    }

    public void message(int level) {
        if (this.level <= level) {
            doChain();
        }
        if (nextChain != null) {
            nextChain.message(level);
        }
    }

    public abstract void doChain();
}
