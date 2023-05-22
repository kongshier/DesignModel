package com.shier.memento.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 11:45
 * 游戏角色类
 */
public class GameRole {
    /**
     * 生命力
     */
    private int vitality;

    /**
     * 攻击力
     */
    private int attack;

    /**
     * 防御力
     */
    private int defense;


    /**
     * 状态显示
     */
    public void displayState() {
        System.out.println("角色当前状态：");
        System.out.println("生命力：" + this.vitality);
        System.out.println("攻击力：" + this.attack);
        System.out.println("防御力：" + this.defense);
        System.out.println();
    }

    /**
     * 初始状态
     *
     * @return
     */
    public void getInitState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    /**
     * 战斗后状态
     *
     * @param
     */
    public void fight() {
        this.vitality = 0;
        this.attack = 0;
        this.defense = 0;
    }

    /**
     * 保存角色状态
     *
     * @return
     */
    public RoleStateMemento savaState(){
        return new RoleStateMemento(this.vitality,this.attack,this.defense);
    }

    /**
     * 恢复角色状态
     * @return
     */
    public void recoveryState(RoleStateMemento roleStateMemento){
        this.setAttack(roleStateMemento.getAttack());
        this.setDefense(roleStateMemento.getDefense());
        this.setVitality(roleStateMemento.getVitality());
    }

    public int getVitality() {
        return vitality;
    }


    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
