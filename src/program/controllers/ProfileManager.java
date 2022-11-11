package program.controllers;

/**
 *
 * @author Cassy McJack
 */
public class ProfileManager {
	
    private static String username ="";
    private static String email ="";

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
