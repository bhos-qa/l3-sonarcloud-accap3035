package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermissionManagerTest {
    private PermissionManager manager = new PermissionManager();
    @Test
    public void enumToRoleNameTest(){
        assertEquals("Admin",manager.enumToRoleName(PermissionLevel.ADMIN));
    }
    @Test
    public void setPermissionLevelTest(){
        // Checking the default value is set to PermissionLevel.USER enum
        assertEquals(PermissionLevel.USER,manager.getRoleName());
        // Change default USER enum to DEVELOPER
        manager.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals(PermissionLevel.DEVELOPER,manager.getRoleName());
    }
}