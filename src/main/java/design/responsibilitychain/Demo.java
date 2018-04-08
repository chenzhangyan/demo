package design.responsibilitychain;

/**
 * Created by chenzhangyan on 2018/4/8.
 */
public class Demo {
    public static void main(String[] args) {
        AbstractChain firstChain = new FirstChain(1);
        AbstractChain secondChain = new SecondChain(2);
        AbstractChain thirdChain = new ThirdChain(3);
        firstChain.setNextChain(secondChain);
        secondChain.setNextChain(thirdChain);
        firstChain.message(2);
    }
}
