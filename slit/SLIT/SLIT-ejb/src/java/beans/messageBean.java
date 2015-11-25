/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Message;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kojar
 */
@Stateless
public class messageBean implements messageBeanRemote {

    @PersistenceContext
    EntityManager em;
    
    @Override
    public Boolean addMessage(String text) {
        
        Message message = new Message();
        message.setText(text);
    
       try {
        em.persist(message);
       }
        catch(Exception e) {
        e.printStackTrace();
        return false;
        }
       
        return true; 
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
