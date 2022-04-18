/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateUserPackage;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Singleton class that holds a hashtable for storing usernames and passwords and an arrayList that stores usernames.
 * The hashtable is used for logging in and the arrayList is used for making sure the usernames are unique. 
 * @author Conor
 */
public class Database {
    private static Database uniqueInstance;
    public Hashtable<String, String> login = new Hashtable();
    public ArrayList<String> al = new ArrayList(); 
    
    private Database(){}
    
    /**
    * Method that allows the single instance of the class to be accessed from outside the class
    */
    public static Database getInstance()
    {
        if (uniqueInstance == null)
        {
            uniqueInstance = new Database();
        }
        return uniqueInstance;
    }
}
