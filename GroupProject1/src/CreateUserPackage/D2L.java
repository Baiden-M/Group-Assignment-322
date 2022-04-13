/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupProject1.src.CreateUserPackage;

/**
 *
 * @author Conor
 */
public class D2L extends ThirdPartyWebsiteDecorator{
    
    public D2L(User user)
    {
        this.user = user;
        System.out.println("Account successfully linked");
    }
}
