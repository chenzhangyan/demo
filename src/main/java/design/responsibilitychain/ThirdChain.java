package design.responsibilitychain;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class ThirdChain extends AbstractChain{
    public ThirdChain(int level) {
        this.level = level;
    }

    @Override
    public void doChain() {
        System.out.println("third-chain");
    }
}
