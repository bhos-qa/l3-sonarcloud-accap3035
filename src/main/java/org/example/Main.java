package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var manager = new PermissionManager();
        System.out.println(manager.getRoleName());
        manager.setPermissionLevel(PermissionLevel.DEVELOPER);
        System.out.println(manager.getRoleName());
        // Converting admin enum to string value of it
        System.out.print(manager.enumToRoleName(PermissionLevel.ADMIN));
    }
}