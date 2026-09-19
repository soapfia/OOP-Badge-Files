package OOP.accounts;

import OOP.accounts.UserAccount;

public class AccountsRunner1 {
    public static void main(String[] args) {
        // 4. Fill in the blanks below for Bill, a UserAccount with username 'bill' and password 'Password123'. 
        //  Then, write a program which involves calling both of Bill's methods.  
        UserAccount bill = new UserAccount("bill", "Password123", "bill@email.com", "Bill"); 

        String username = bill.getUsername();
        String password = bill.getPassword();
        String email = bill.getEmail();
        String name = bill.getName();

        System.out.println(name + "'s account is " + username);


        // 5. After all of that, create another user. Fill in the blank below for a program which asks the user for a username/password, and checks 
    }
}

