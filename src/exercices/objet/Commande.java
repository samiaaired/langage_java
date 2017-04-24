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
public class Commande {
    private String description;
    private int prix;

    public Commande(String description, int prix) {
        this.description = description;
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    public void affiche_commande (){
        System.out.println("la commande est: "+this.description+" dont le prix est:"+" "+this.prix);
    }
    
}
