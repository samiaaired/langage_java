/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.animaux;

/**
 *
 * @author formation
 */
abstract public class Animal {

    

    protected String nom;
    protected int x = 0;
    protected int y = 0;

    public Animal(String nom) {
        this.nom = nom;
    }
    
    

    abstract public void bouger();

    abstract public void manger();

    @Override
    public String toString() {
        return "Animal{" + "nom=" + nom + ", x=" + x + ", y=" + y + '}';
    }
    

}
