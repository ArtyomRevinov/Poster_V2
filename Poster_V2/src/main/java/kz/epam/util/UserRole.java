package kz.epam.util;

/**
 * @author Artyom Revinov
 */
public class UserRole {
    public static String getUserRole(int role){
        switch (role){
            case 1 : return "admin";
            case 2 : return "user";

            default: return  "guest";
        }
    }
}
