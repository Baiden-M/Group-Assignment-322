/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;
/**
 *
 * @author Conor
 */
public class Student extends User{
    private String firstname;
    private String lastname;
    private Username username;
    private Password password;
    private Scanner input = new Scanner(System.in);
    private Database d = Database.getInstance();

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
            //*make new student
        }
        System.out.println("Would you like to link D2L? (yes/no)");
        s = input.nextLine();
        if(s.equalsIgnoreCase("yes"))
        {
            //*make new student
        }
    }
    public void Login()
    {
        System.out.println("Enter your username");
        String un = input.nextLine();
        System.out.println("Enter your password");
        String pass = input.nextLine();
        if ((d.login.get(un)).equals(pass))
        {
            System.out.println("Successfully Logged In");
        }
        else
        {
            System.out.println("Incorrect username or password");
        }
    }
}
