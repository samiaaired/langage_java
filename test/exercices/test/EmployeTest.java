/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Employe;
import java.util.LinkedHashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class EmployeTest {
    
    @Test
    public void testEmploye(){
        
       Employe emp1= new Employe() ;
       Employe emp2= new Employe();
       emp1.setNom("Durand");
       emp1.setPrenom("Gerard");
       emp1.setSalaire(2000);
       
       emp2.setNom("Dupont");
       emp2.setPrenom("Marie-Helene");
       emp2.setSalaire(3200);
       
        System.out.println(emp1);
        System.out.println(emp2);
        
        System.out.println("*************************************");
        
        
       
         LinkedHashSet <Employe> employes= new LinkedHashSet<>();
         employes.add(emp1);
         employes.add(emp2);
         System.out.println(employes);

        
    }






}
