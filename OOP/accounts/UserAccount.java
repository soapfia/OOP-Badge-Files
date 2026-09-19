package OOP.accounts;

public class UserAccount {
    // 1. Fill out the properties
    public String username; 
    private String password; 
    public String email;
    public String name;

    // 2. Write constructor for UserAccount
    public UserAccount(String username, String password, String email, String name) {
        this.username = username; 
        this.password = password; 
        this.email = email;
        this.name = name;
        
    }

    // 3. Write your methods here
    public void printUserame () {
        System.out.println("Username: " + username);
    }

    public void printPassword () {
        System.out.println("Password: " + password);
    }

    public void resetUsername(String newUsername) {
        this.username = newUsername;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getUsername(){return username;}
    public String getPassword(){return password;}
    public String getName(){return name;}
    public String getEmail(){return email;}

    
}