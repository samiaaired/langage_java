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
public class Commande2 {
    
private String description;
    private int prix;

    public Commande2(String description, int prix) {
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

    @Override
    //redifinition de la définition de la méthode tostring
    public String toString() {
        return "Commande2{" + "description=" + description + ", prix=" + prix + '}';
    }
    
    
}
