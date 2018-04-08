package design.responsibilitychain;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class SecondChain extends AbstractChain{
    public SecondChain(int level) {
        this.level = level;
    }

    @Override
    public void doChain() {
        System.out.println("second-chain");
    }
}
