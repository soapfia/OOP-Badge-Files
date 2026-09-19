package OOP.accounts;

import java.util.Scanner;

public class AccountsRunner2 {
    public static void main(String[] args) {
        // 5. Create two UserAccount variables `user1` and `user2` with usernames and passwords of your choosing. 
        //  Fill in the blank below for a program which asks the user for a username/password and checks 

        UserAccount user1 = new UserAccount("bill", "Password123", "bill@email.com", "Bill");
        UserAccount user2 = new UserAccount ("bob", "bobspass", "bob@email.com", "Bob");

        Scanner input = new Scanner(System.in);

        String username1 = user1.getUsername();
        String userrealname1 = user1.getName();
        String userpassword1 = user1.getPassword();
        String userEmail1 = user1.getEmail();

        String username2 = user2.getUsername();
        String userrealname2 = user2.getName();
        String userpassword2 = user2.getPassword();
        String userEmail2 = user2.getEmail();

        System.out.print("Enter username: ");  
        String username = input.nextLine(); 
        System.out.print("Enter password: "); 
        String password = input.nextLine();

        if (username.equals(username1) && password.equals(userpassword1)) {
            // print `Welcome user1!`
            System.out.println("Welcome user1");
        } else if (username.equals(username2) && password.equals(userpassword2)) {
            // print `Welcome user2!`
            System.out.println("Welcome user2!");
        } else {
            // print invalid username/password
            System.out.println("Invalid username or password. Please try again.");
        }

        input.close(); 
    }
}
