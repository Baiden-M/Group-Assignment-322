/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateUserPackage;
import java.math.BigInteger;
/**
 *
 * @author Conor
 */
public class PhoneNumber extends PhoneDecorator{
    private BigInteger number;
    
    public PhoneNumber(User user, BigInteger num)
    {
        this.user = user;
        number = num;
        System.out.println("Phone number successfully added");
    }
    
    public BigInteger getPhoneNumber()
    {
        return number;
    }
}
