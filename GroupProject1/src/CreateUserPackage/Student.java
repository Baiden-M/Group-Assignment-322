/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateUserPackage;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;
import java.math.BigInteger;
/**
 * Student class that creates new students
 * @author Conor
 */
public class Student extends User{
    private String firstname;
    private String lastname;
    private Username username;
    private Password password;
    private Scanner input = new Scanner(System.in);
    private Database d = Database.getInstance();
/**
* Constructor class that asks user for first name, last name, user name, and password. 
* Ensures that the username has not already been used and that the password is long enough.
* Asks user if they would like to add a phone number and if they do it uses a decorator class to add the phone number.
* Asks user if they would like to connect their D2L and if they do it uses a decorator to connect D2L.
*
*/
    public Student(){
        System.out.println("Please enter your first name");
        String s = input.nextLine();
        firstname = s;
        System.out.println("Please enter your last name");
        s = input.nextLine();
        lastname = s;
        System.out.println("Please enter a username");
        s = input.nextLine();
        while(d.al.contains(s) == true)
        {
            System.out.println("This username is already taken. Please enter a new username");
            s = input.nextLine();
        }
        username = new Username(s);
        System.out.println("Please enter a password");
        s = input.nextLine();
        while(s.length() < 8)
        {
            System.out.println("Password is too short. Please enter a new password (8 characters or more)");
            s = input.nextLine();
        }
        password = new Password(s);
        d.login.put(username.getUsername(), password.getPassword());
        System.out.println("Would you like to add a phone number? (yes/no)");
        s = input.nextLine();
        if(s.equalsIgnoreCase("yes"))
        {
            System.out.println("Please enter your phone number with no parentheses or dashes");
            s = input.nextLine();
            BigInteger num = new BigInteger(s);
            User student = new PhoneNumber(this, num);
        }
        System.out.println("Would you like to link D2L? (yes/no)");
        s = input.nextLine();
        if(s.equalsIgnoreCase("yes"))
        {
            User student = new D2L(this);
        }
    }
}
