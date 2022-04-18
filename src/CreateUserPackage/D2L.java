/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateUserPackage;

/**
 * Class that decorates the user
 * @author Conor
 */
public class D2L extends ThirdPartyWebsiteDecorator{
   
    /**
    * Constructor that sets the user to the input user and prints out a success statement.
    */
    public D2L(User user)
    {
        this.user = user;
        System.out.println("Account successfully linked");
    }
}
