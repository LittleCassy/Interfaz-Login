/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.model;

/**
 *
 * @author Cassy McJack
 */
public class ProfileManager {
    private static String username;
    private static String email;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        ProfileManager.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        ProfileManager.email = email;
    }
    
    
}
