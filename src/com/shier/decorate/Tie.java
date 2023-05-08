package com.shier.decorate;

/**
 * @author Shier
 * CreateTime 2023/4/16 22:47
 */
public class Tie extends Finery{
    @Override
    public void show() {
        System.out.print("领带");
        super.show();
    }
}
