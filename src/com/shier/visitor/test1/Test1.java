package com.shier.visitor.test1;

/**
 * @author Shier
 * CreateTime 2023/5/24 21:56
 */
public class Test1 {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        //成功时的反应
        Success v1 = new Success();
        o.display(v1);


        //失败时的反应
        Failing v2 = new Failing();
        o.display(v2);

        //恋爱时的反应
        Amativeness v3 = new Amativeness();
        o.display(v3);

        //婚姻时的反应
        Marriage v4 = new Marriage();
        o.display(v4);
    }
}
