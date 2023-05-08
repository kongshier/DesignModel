package com.shier.oop;

/**
 * @Author Shier
 * CreateTime 2023/4/3 16:47
 */
public  class Animal {
    protected String name = "";
    protected int shoutNum = 5;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public int getShoutNum() {
        return shoutNum;
    }

    public void setShoutNum(int shoutNum) {
        if (shoutNum <= 10) {
            this.shoutNum = shoutNum;
        } else {
            this.shoutNum = 10;
        }
    }
    public String shout() {
        String result = "";
        for (int i = 0; i < shoutNum; i++) {
            result = getShoutSound() + " ";
        }
        return "我叫" + name + result + "~~~";
    }

    protected  String getShoutSound() {
        return "";
    }
}
