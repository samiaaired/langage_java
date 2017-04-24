/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.ClasseStatique;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */


public class ObjetTest {
    
    @Test //Annotation qui permet d'executer le test 
    public void testStatique2(){
        //new ClasseStatique();
        ClasseStatique.geInstance();
        ClasseStatique.afficheNbInstances();
        
    }
    @Test //Annotation qui permet d'executer le test 
    public void testStatique(){
        
        ClasseStatique.afficheNbInstances();
        
    }
    
}