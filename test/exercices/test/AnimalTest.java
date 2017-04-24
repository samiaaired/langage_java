/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Animal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class AnimalTest {
    
    @Test
    
    public void testConstructeur(){
        
        //Avec le constructeur par défaut 
       Animal renard = new Animal();
      // Animal Corbeau= new Animal;
       renard.setNom("rox");
       renard.setNbPattes(4);
       renard.setGenre("volupte");
       renard.affiche();
       
       Animal corbeau= new Animal();
       corbeau.setNom("toto");
       corbeau.setNbPattes(2);
       corbeau.setGenre("oiseau");
       corbeau.affiche();
       
       //avec le constructeur à 3 paramètres 
       
       Animal renard2 = new Animal("rox",4,"renards");
       Animal corbeau2 = new Animal ("toto2",2,"oiseau");
      
        
    }
}
