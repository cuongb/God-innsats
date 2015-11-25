/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import Entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import javax.ejb.Stateless;

/**
 *
 * @author olama
 */
@Stateless
public class UserBean implements UserBeanRemote {

    @PersistenceContext
    EntityManager em;
   
    
    /**
     *
     * @param username
     * @param password
     * 
     */
    @Override
    public void addUser(String username, String password){
        
        User u = new User();
        u.setUN(username);
        u.setPW(password);
        
        em.persist(u);
        
    }
    
    /*
    Validates the login info, username and password with the User table in the 
    DB
    */
    @Override
    public boolean validate(String un, String pw){
        TypedQuery<User> query = 
                em.createQuery("SELECT * from USER where username='"+un+"'&& password='"+pw+"'",User.class);
        //List<User>;
        
        
        String dbUsername = "resultset from query";
        String dbPassword = "resultset from query";
        
        
        return un.equals(dbUsername)&&pw.equals(dbPassword);
        //return true om det stemmer
        
    }
    
    public ArrayList<String>listUsers(){
        TypedQuery<User> q =
                em.createQuery("select u from User as u", User.class);
        List<User> users = q.getResultList();
        ArrayList<String> result = new ArrayList<String>();
        
        for(User user : users){
            result.add(user.getUN());
        }
        return result;
    }
    
    
}
