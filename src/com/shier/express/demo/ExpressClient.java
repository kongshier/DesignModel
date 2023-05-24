package com.shier.express.demo;

import java.util.ArrayList;

/**
 * @author Shier
 * CreateTime 2023/5/24 19:31
 */
public class ExpressClient {
    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> arrayList = new ArrayList<>();
        arrayList.add(new TerminalExpression());
        arrayList.add(new NotTerminalExpression());
        arrayList.add(new TerminalExpression());
        arrayList.add(new TerminalExpression());
        for (AbstractExpression expression : arrayList) {
            expression.interpret(context);
        }
    }
}
