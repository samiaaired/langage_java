/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Client2;
import exercices.objet.Commande2;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class ClientTest2 {

    @Test
    public void testClient2() {

        Commande2 commande3 = new Commande2("la commande1 est composé d'une margharita et d'un coca ", 15);
        Commande2 commande4 = new Commande2("la commande2 est composé d'un Tacos taille m avec sauce chezzy et d'un coca zeo ", 7);

        Client2 client3 = new Client2("Dupont", "Bernad", 56, commande3);
        Client2 client4 = new Client2("Durand", "Amelie", 24, commande4);

        System.out.println(client3);
        
        System.out.println(commande3);
        System.out.println(client4);
        
        System.out.println(commande4);
        
        

    }

}
