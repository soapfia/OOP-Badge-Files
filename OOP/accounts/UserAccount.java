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

    
}