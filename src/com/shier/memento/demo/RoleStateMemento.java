package com.shier.memento.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 11:59
 * 角色状态记录
 */
public class RoleStateMemento {
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

    public RoleStateMemento(int vitality, int attack, int defense) {
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
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
