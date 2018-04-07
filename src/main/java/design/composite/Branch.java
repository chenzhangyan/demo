package design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenzhangyan on 2018/4/7.
 */
public class Branch {
    private String name;
    private List<Branch> subBranch = new ArrayList<Branch>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Branch> getSubBranch() {
        return subBranch;
    }

    public void setSubBranch(List<Branch> subBranch) {
        this.subBranch = subBranch;
    }

    public void addSub(Branch branch) {
        subBranch.add(branch);
    }
    public void removeSub(Branch branch) {
        subBranch.remove(branch);
    }

    public void show() {
        for (Branch branch : subBranch) {
            System.out.println(name + "下属分支：" + branch.getName());
            branch.show();
        }
    }
}
