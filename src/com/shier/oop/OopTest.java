package com.shier.oop;

/**
 * @author Shier
 * CreateTime 2023/4/3 16:48
 */
public class OopTest {
    public static void main(String[] args) {
        // 创建一个Animal动物数组
        Animal[] arrayAnimals = new Animal[5];
        arrayAnimals[0] = new Cat("小秀");
        arrayAnimals[1] = new Dog("花花");
        arrayAnimals[2] = new Cat("丫丫");
        arrayAnimals[3] = new Dog("阿明");
        arrayAnimals[4] = new Cat("一一");

        for (int i = 0; i < arrayAnimals.length; i++) {
            System.out.println(arrayAnimals[i].shout());
        }

        // 创建两个实列
        MachineCat machineCat = new MachineCat("叮当猫");
        MachineDog machineDog = new MachineDog("细狗");

        // 接口数组
        ChangeThings[] changeThings = new ChangeThings[2];
        changeThings[0] = machineCat;
        changeThings[1] = machineDog;
        // 多态
        System.out.println(changeThings[0].changThings("很多东西！"));
        System.out.println(changeThings[1].changThings("给主人买菜！"));
    }
}
