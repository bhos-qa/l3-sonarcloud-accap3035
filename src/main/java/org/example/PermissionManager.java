package org.example;
public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {
        // Initialize mCurrentLevel with the default value (USER).
        this.mCurrentLevel = PermissionLevel.USER;
    }

    public String enumToRoleName(PermissionLevel permissionLevel){
        return permissionLevel.getRoleName();
    }
    public PermissionLevel getRoleName() {
        return this.mCurrentLevel;
    }

    public void setPermissionLevel(PermissionLevel newLevel) {
        this.mCurrentLevel = newLevel;
    }
}