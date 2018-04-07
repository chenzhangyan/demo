package design.composite;

/**
 * Created by chenzhangyan on 2018/4/7.
 */
public class Demo {
    public static void main(String[] args) {
        Branch branch = new Branch("主干");
        Branch branch1 = new Branch("枝干一");
        Branch branch2 = new Branch("枝干二");
        Branch branch3 = new Branch("枝干三");
        Branch branch4 = new Branch("枝干四");
        Branch branch11 = new Branch("枝干一一");
        Branch branch12 = new Branch("枝干一二");
        Branch branch21 = new Branch("枝干二一");
        Branch branch22 = new Branch("枝干二二");
        Branch branch31 = new Branch("枝干三一");
        Branch branch41 = new Branch("枝干四一");
        branch.addSub(branch1);
        branch.addSub(branch2);
        branch.addSub(branch3);
        branch.addSub(branch4);
        branch1.addSub(branch11);
        branch1.addSub(branch12);
        branch2.addSub(branch21);
        branch2.addSub(branch22);
        branch3.addSub(branch31);
        branch4.addSub(branch41);
        branch.show();
    }
}
