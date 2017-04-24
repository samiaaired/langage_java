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
public class Animal {
    
    private String nom;
    private int nbPattes;
    private String genre;
   
    
    //Construteur par défaut
    public Animal(){
        
    }
    
    //un autre constructeur 
    public Animal (String nom, int nbPattes, String genre){
        this.nom=nom;
        this.nbPattes=nbPattes;
        this.genre=genre;
        
    }
 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) { 
        this.nom = nom; // this.nom fait référence à Private nom de la classe 
                         // nom fait référence au paramètre de la fonction getNom
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void affiche(){
        System.out.println("Le nom de cet animal est :"+nom+" " +"a "+" "
                +nbPattes+" "+"pattes"+" et son genre est "+" "+genre);
        
        /*
        ou bien System.out.println("Le nom de cet animal est :"+this.nom+" " +"a "+" "
                +this.nbPattes+" "+"pattes"+" et son genre est "+" "+this.genre);
        */
    }
    
}
