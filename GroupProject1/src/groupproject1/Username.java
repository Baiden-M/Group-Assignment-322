/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject1;
import java.util.*;
/**
 *
 * @author Conor
 */
public class Username {
    private String username;
    private Database d = Database.getInstance();
    
    public Username(String s)
    {
        username = s;
        d.al.add(s);
        
    }

    public String getUsername()
    {
        return username;
    }
}
