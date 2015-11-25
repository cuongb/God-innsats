/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slitclient;

import beans.StudentBeanRemote;
import beans.UserBeanRemote;
import java.util.ArrayList;

import javax.ejb.EJB;

/**
 *
 * @author Kojar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @EJB(name="StudentBean")
    private static StudentBeanRemote StudentRemote;
    private static UserBeanRemote UserRemote;
        // TODO code application logic here
    
    
    public static void main(String[] args) {
    
       /** String result = messageInstance.addStudent("Yalla", "Ali", "ali@jihad.is");
        
        * System.out.println("result: "+result);**/
        for(int i=0;i<10;i++){
            StudentRemote.addStudent("Yalla "+i, "Ali", "ali@jihad.is");
        }
        
        
        ArrayList<String> students = StudentRemote.listStudents();
        
        System.out.println("TOtal students: "+students.size());
        for(String str : students){
            System.out.println("student: " + str);
        }
        
        
    }
    //Creates a user, and logs in.
    public void Login(){
        UserRemote.addUser("testUN", "testPW");
        
        if(UserRemote.validate("testUN", "testPW"))
        {
            //Set up the frame after logging in.
            
        }
        else
        {
            System.out.println("Error, wrong password or username");
        }
        
        }
        
        
    }
    
    

