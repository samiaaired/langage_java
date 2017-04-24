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
public class Client2 {
 private String nom;
    private String prenom; 
    private int age;
    private Commande2 commande2;

    public Client2(String nom, String prenom, int age, Commande2 commande) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.commande2 = commande2;
    }
   
    public Commande2 getCommande2() {
        return commande2;
    }

    public void setCommande2(Commande commande) {
        this.commande2 = commande2;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client2{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", commande2=" + commande2 + '}';
    }
    
    
    
}
