/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Remote;

/**
 *
 * @author olama
 */
@Remote
public interface UserBeanRemote {

    public void addUser(String username, String Password);

    public boolean validate(String un, String pw);
   

    
}
