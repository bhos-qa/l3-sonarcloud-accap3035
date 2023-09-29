package org.example;

public enum PermissionLevel {
    ADMIN("Admin"),
    DEVELOPER("Developer"),
    USER("User");

    private final String roleNameString;

    private PermissionLevel(String roleNameStringInput) {this.roleNameString = roleNameStringInput;}
    public String getRoleNameString() {return this.roleNameString;}
}