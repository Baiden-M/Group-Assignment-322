/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject1;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Conor
 */
public class Database {
    private static Database uniqueInstance;
    public Hashtable<String, String> login = new Hashtable();
    public ArrayList<String> al = new ArrayList(); 
    
    private Database(){}
    
    public static Database getInstance()
    {
        if (uniqueInstance == null)
        {
            uniqueInstance = new Database();
        }
        return uniqueInstance;
    }
}
