/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.Scanner;

/**
 *
 * @author formation
 */
public class Partie {

    public static void main(String[] args) {
            double r= (int)Math.random()*100+1;
              partie();
              System.out.println ("vouler vous retentez le jeu :");
              Scanner Scanner4= new Scanner(System.in);
              String reponse = Scanner4.nextLine();
              if (reponse =="oui"){
                  partie();
              }
              else {
                  System.out.println ("Au revoir, à une prochaine fois");
              }
                      
    }

    public static void partie(){ 
         System.out.println("Joueur 1: Entrer un chiffre entre 1 et 100:");

        Scanner scanner = new Scanner(System.in);
        int chiffre = scanner.nextInt();
        System.out.println("Jouer 2: Essayer de deviner le chiffre saisi par le joueur1: ");
        Scanner scanner2 = new Scanner(System.in);
        int chiffre2 = scanner.nextInt();
        
            if (chiffre > chiffre2){
                
                System.out.println("Le chiffre que tu as entré est plus petit");
            }
            
            else if (chiffre < chiffre2){
                
                System.out.println("Le chiffre que tu as entré est plus grand");
            }
            else {
                System.out.println(" Génial");
            }
            int i = 0;
   
               while (chiffre != chiffre2){
           
            System.out.println("Jouer 2: retenter votre chance: ");
            Scanner scanner3 = new Scanner(System.in);
            int resaisie = scanner3.nextInt();
            chiffre2 = resaisie;
        
              i = i + 1;
            } 
               int j=i+1;
                    System.out.println("vous avez réussi à trouver le chiffre au bout de:" + j + "tentatives");
                    if (j<=3){
                        System.out.println("Bravo tu mérites : ***");
                    }
                    else if( j>3 && j<=6){
                        System.out.println("Bravo tu mérites : **");
                    }
                    else {
                        System.out.println("Vous êtes Null");
                    }
}

}

