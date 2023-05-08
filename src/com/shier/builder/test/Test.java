package com.shier.builder.test;

import javax.swing.*;
import java.awt.*;

/**
 * @author Shier
 * CreateTime 2023/4/25 22:45
 */
public class Test extends JFrame {
    public Test() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void paint(Graphics graphics) {
        // 建造瘦小人
        PersonBuilder thinBuilder = new PersonThinBuilder(graphics);
        PersonDirector thinDirector = new PersonDirector(thinBuilder);
        thinDirector.CreatePerson();
        // 建造胖小人
        PersonFatBuilder fatBuilder = new PersonFatBuilder(graphics);
        PersonDirector fatDirector = new PersonDirector(fatBuilder);
        fatDirector.CreatePerson();
    }

    public static void main(String[] args) {
        new Test();
    }
}
