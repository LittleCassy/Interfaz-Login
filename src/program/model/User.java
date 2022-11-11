/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.model;

/**
 *
 * @author Cassy McJack
 */
public class User {
    private static String username;
    private static String email;
    private static String password;
    private static String birthday;
    private static String consoles;

    public User(String username, String email, String password, String birthday, String consoles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        this.consoles = consoles;
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

    public static String getConsoles() {
        return consoles;
    }

    public static void setConsoles(String consoles) {
        User.consoles = consoles;
    }
    
    
}
