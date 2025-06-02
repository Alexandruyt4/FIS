package model;

public class User {
    private int id;
    private String username;
    private String password;
    private String FullName;
    private String role;

    public User(int id, String username, String password, String FullName, String role)
    {
        this.id = id;
        this.username = username;
        this.password = password;
        this.FullName = FullName;
        this.role = role;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getFullName(){
        return FullName;
    }

    public String getRole(){
        return role;
    }
}
