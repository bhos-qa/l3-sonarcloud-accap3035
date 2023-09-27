package org.example;


public enum PermissionLevel {
    ADMIN("Admin"),
    DEVELOPER("Developer"),
    USER("User");

    private final String roleName;

    // Constructor for enum
    PermissionLevel(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
