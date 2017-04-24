/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Client;
import exercices.objet.Commande;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class ClientTest {

   
    @Test
    public void testClient() {

        Commande commande1 = new Commande("la commande1 est composé d'une margharita et d'un coca ", 15);
        Commande commande2 = new Commande("la commande2 est composé d'un Tacos taille m avec sauce chezzy et d'un coca zeo ", 7);

        commande1.affiche_commande();
        commande2.affiche_commande();

        Client client1 = new Client("Dupont", "Bernad", 56, commande1);
        Client client2 = new Client("Durand", "Amelie", 24, commande2);
        client1.afficher();
        client2.afficher();
         
    }

}
