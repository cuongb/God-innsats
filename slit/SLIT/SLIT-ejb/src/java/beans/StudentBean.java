/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import Entities.Student;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class StudentBean implements StudentBeanRemote {

    @PersistenceContext
    EntityManager em;
    
    @Override
    public String addStudent(String FirstName, String LastName, String Email) {
        
        Student s = new Student();
        s.setFirstName(FirstName);
        s.setLastName(LastName);
        s.setEmail(Email);
       
        em.persist(s);
        return s.getFirstName() + ", " + s.getLastName();
    }
    
    @Override
    public ArrayList<String> listStudents() {
        TypedQuery<Student> q = 
		em.createQuery("select s from Student as s", Student.class);
        List<Student> studs = q.getResultList();
        ArrayList<String> result = new ArrayList<String>();
    
        for(Student stud : studs){
            result.add(stud.getLastName());
            
        }
        return result;
    }
    
    
}
