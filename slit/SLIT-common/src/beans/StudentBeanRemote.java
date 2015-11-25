/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Kojar
 */
import java.util.ArrayList;
import javax.ejb.Remote;

@Remote
public interface StudentBeanRemote {
    String addStudent(String FirstName, String LastName, String Email);

    ArrayList<String> listStudents();
}
