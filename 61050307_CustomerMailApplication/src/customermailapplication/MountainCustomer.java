/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

/**
 *
 * @author sarun
 */
//make this class a subclass of customer
public class MountainCustomer extends Customer {

     @Override
    public String createMail() {
        return "Mountain Customer";
    }
    
}
