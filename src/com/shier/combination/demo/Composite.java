package com.shier.combination.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shier
 * CreateTime 2023/5/10 17:23
 */
public class Composite extends Component {

    /**
     * 子对象集合依赖存储下属的枝节点和叶子节点
     */
    private List<Component> childrenList = new ArrayList<Component>();


    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        childrenList.add(component);
    }

    @Override
    public void remove(Component component) {
        childrenList.remove(component);
    }

    @Override
    public void display(int depth) {
        // 叶节点具体显示方法，显示名称和级别
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        // 遍历下级节点
        for (Component component : childrenList) {
            component.display(depth + 1);
        }
    }
}
