package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermissionManagerTest {
    @Test
    public void enumToRoleNameStringTest() {
        PermissionManager manager = new PermissionManager();
        assertEquals("Admin", manager.enumToRoleNameString(PermissionLevel.ADMIN));
    }
    @Test
    public void getRoleNameEnumTest(){
        PermissionManager manager = new PermissionManager();
        assertEquals(PermissionLevel.USER, manager.getRoleNameEnum());
    }
    @Test
    public void setPermissionLevelTest() {
        PermissionManager manager = new PermissionManager();
        assertEquals(PermissionLevel.USER, manager.getRoleNameEnum());
        manager.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals(PermissionLevel.DEVELOPER, manager.getRoleNameEnum());
    }
}