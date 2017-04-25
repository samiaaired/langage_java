/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.interfaces;

/**
 *
 * @author formation
 */
public class BombardierFlottant implements Volant, Bombardant,Mitraillant,Flottant {

    @Override
    public void voler() {
        System.out.println(" Bombardier Vole");
        
    }

    @Override
    public void bombarder() {
         System.out.println(" Bombardier Bombarde");
    }

    @Override
    public void mitrailler() {
         System.out.println(" Bombardier Mitraille");
    }

    @Override
    public void flotter() {
         System.out.println(" Bombardier Flotte");
        
    }
        
    
}
