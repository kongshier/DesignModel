package com.shier.memento.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 11:51
 */
public class GameClient {
    public static void main(String[] args) {
        // 战斗前
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.displayState();

        // 保存进度
        GameRole backRole = new GameRole();
        backRole.setAttack(gameRole.getAttack());
        backRole.setDefense(gameRole.getDefense());
        backRole.setVitality(gameRole.getVitality());

        // 战斗
        gameRole.fight();
        gameRole.displayState();

        // 恢复战斗前状态
        gameRole.setVitality(backRole.getVitality());
        gameRole.setDefense(backRole.getDefense());
        gameRole.setAttack(backRole.getAttack());
        // 显示恢复后的状态
        gameRole.displayState();
    }
}
