package com.shier.decorate;

/**
 * @author Shier
 * CreateTime 2023/4/16 22:47
 */
public class TShirts extends Finery{

    @Override
    public void show() {
        System.out.print("大T恤");
        super.show();
    }
}
