package OOP.accounts;

import java.util.Scanner;

public class AccountsRunner2 {
    public static void main(String[] args) {
        // 5. Create two UserAccount variables `user1` and `user2` with usernames and passwords of your choosing. 
        //  Fill in the blank below for a program which asks the user for a username/password and checks 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");  
        String username = input.nextLine(); 
        System.out.print("Enter password: "); 
        String password = input.nextLine();

        if (/*Username & password matches user1 */) {
            // print `Welcome user1!`
            System.out.println("Welcome user1");
        } else if (/*Username & password matches user2 */) {
            // print `Welcome user2!`
            System.out.println("Welcome user2!");
        } else {
            // print invalid username/password
            System.out.println("Invalid username or password. Please try again.");
        }

        input.close(); 
    }
}
