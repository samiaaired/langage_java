/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

/**
 *
 * @author formation
 */
public class Employe extends Personne{
    
    private double salaire;
    
    //Constructur 

   public Employe( String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    
    @Override
    public String toString() {
        return "Employe{" + super.toString()+"salaire=" + this.salaire + '}';
    }

   
    
    

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
} 
    
