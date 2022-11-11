package program.controllers;

/**
 *
 * @author Cassy McJack
 */
public class User {
    private static String username;
    private static String email;
    private static String password;
    private static String birthday;

    public User(String username, String email, String password, String birthday) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
    }
    
    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        User.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        User.email = email;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static String getBirthday() {
        return birthday;
    }

    public static void setBirthday(String birthday) {
        User.birthday = birthday;
    }
}
