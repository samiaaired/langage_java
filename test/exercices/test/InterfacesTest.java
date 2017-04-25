/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.interfaces.Bombardant;
import exercices.interfaces.BombardierFlottant;
import exercices.interfaces.Flottant;
import exercices.interfaces.HydravionMitrailleur;
import exercices.interfaces.Mitraillant;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class InterfacesTest {
    @Test
    public void InterfacesTest() {
        
        
        //1.1 créer 2 objets BombardierFlottant
        
        BombardierFlottant bombardier1= new BombardierFlottant();
        BombardierFlottant bombardier2= new BombardierFlottant();
        
        //1.2 Créer deux objets HydravionMitrailleur
        
        HydravionMitrailleur hydravion1 = new HydravionMitrailleur();
        HydravionMitrailleur hydravion2 = new HydravionMitrailleur();
        
        // 2 créer des listes 
        List <Flottant> flottantListe = new ArrayList();
        flottantListe.add(bombardier1);
        flottantListe.add(bombardier2);
        
        List <Mitraillant> mitraillantListe = new ArrayList();
        mitraillantListe.add(hydravion1);
        mitraillantListe.add(hydravion2);
        List <Bombardant> bombardantListe = new ArrayList();
        bombardantListe.add(bombardier1);
        bombardantListe.add(bombardier2);
        
        
        //3 Iterer sur chaque liste 
        for (Bombardant bombardant : bombardantListe) {
            System.out.println("la liste des bombardant");
              bombardant.bombarder();
              
               System.out.println("******************");
            }
        for (Mitraillant mitraillant : mitraillantListe) {
            System.out.println("la liste des mitraillant");
              mitraillant.mitrailler();
              
              System.out.println("******************");
            }
        
        for (Flottant flottant : flottantListe) {
            System.out.println("la liste de flottant");
               flottant.flotter();
            }
        
    }

}
