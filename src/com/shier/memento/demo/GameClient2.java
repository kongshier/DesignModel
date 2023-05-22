package com.shier.memento.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 11:51
 */
public class GameClient2 {
    public static void main(String[] args) {
        // 战斗前
        GameRole role = new GameRole();
        role.getInitState();
        role.displayState();

        // 保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(role.savaState());

        // 战斗
        role.fight();
        role.displayState();

        // 恢复战斗前状态
        role.recoveryState(caretaker.getRoleStateMemento());
        // 显示恢复后的状态
        role.displayState();
    }
}
