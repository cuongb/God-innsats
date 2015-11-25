/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Message;
import javax.ejb.Remote;

/**
 *
 * @author Kojar
 */
@Remote
public interface messageBeanRemote {

    Boolean addMessage(String text);
    
}
