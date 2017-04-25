/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.animaux.Oiseau;
import exercices.animaux.Poisson;
import exercices.animaux.Animal;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class AnimalPoissonOiseauTest {

    @Test
    public void AnimalPoissonOiseauTest() {

        ArrayList<Animal> animauxListe = new ArrayList();
        //ou bien :
     //   List<Animal> animauxListe = new ArrayList();
        
        Poisson poissonRouge = new Poisson("poissonRouge");
        
        Poisson poissonChat = new Poisson("poissonChat");
        

        Oiseau pie = new Oiseau("pie");
        
        Oiseau rossignol = new Oiseau("rossignol");
        animauxListe.add(poissonRouge);
        animauxListe.add(poissonChat);
        animauxListe.add(pie);
        animauxListe.add(rossignol);
        for (Animal animal : animauxListe) {
            System.out.println(animauxListe);
            animal.bouger();
            animal.manger();
            
      
        }

    }
}
