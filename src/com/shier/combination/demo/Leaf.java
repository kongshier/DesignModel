package com.shier.combination.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 17:20
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("此节点为叶子节点，不能新增子叶子节点");
    }

    @Override
    public void remove(Component component) {
        System.out.println("此节点为叶子节点，不能删除子叶子节点");
    }

    @Override
    public void display(int depth) {
        // 叶节点具体显示方法，显示名称和级别
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
