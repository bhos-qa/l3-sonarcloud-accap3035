package org.example;

public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {this.mCurrentLevel = PermissionLevel.USER;}

    public String enumToRoleNameString(PermissionLevel permissionLevel) {
        return permissionLevel.getRoleNameString();
    }

    public PermissionLevel getRoleNameEnum() {
        return this.mCurrentLevel;
    }

    public void setPermissionLevel(PermissionLevel newLevel) {
        this.mCurrentLevel = newLevel;
    }
}