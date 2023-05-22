package com.shier.memento.demo;

/**
 * @author Shier
 * CreateTime 2023/5/10 12:04
 * 角色管理类
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
