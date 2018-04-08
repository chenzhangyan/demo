package design.responsibilitychain;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class FirstChain extends AbstractChain {
    public FirstChain(int level) {
        this.level = level;
    }

    @Override
    public void doChain() {
        System.out.println("first-chain");
    }
}
