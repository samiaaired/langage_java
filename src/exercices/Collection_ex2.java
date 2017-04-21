/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.ArrayList;

/**
 *
 * @author formation
 */
public class Collection_ex2 {

    public static void main(String[] args) {
        //1.création de la liste A et ajouter a,b,c
        ArrayList listeA = new ArrayList();
        listeA.add("a");
        listeA.add("b");
        listeA.add("c");

        // 2.création de la liste B et ajouter d,e,f
        ArrayList listeB = new ArrayList();
        listeB.add("d");
        listeB.add("e");
        listeB.add("f");

        
        //3 ListeC=ListeA+ListeB
        
        ArrayList listeC = new ArrayList();

        listeC.addAll(listeA);
        listeC.addAll(listeB);
        //5.vérifier que l'élément "a" est dans la listeC
        boolean j = listeC.contains("a");
        System.out.println(j);
        //4.Supprimer l'élément "a" de la listeC
        listeC.remove("a");

        //6.affichage de la liste C 
        for (Object listeChange : listeC) {
            System.out.println(listeChange);
        } 
        
        //ou bien faire l'affichage de la listeC comme cela 
        
       System.out.println(listeC);

    }

}
