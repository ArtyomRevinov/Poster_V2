package kz.epam.entity;




/**
 * @author Artyom Revinov
 */
public class User  {


    private int id;
    private String username;
    private String password;
    private String email;
    private int role;



    public User(){}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }



    public String getUsername() {
        return username;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {return role;}

    public void setRole(int role) {this.role = role;}
}
