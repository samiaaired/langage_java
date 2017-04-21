/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author formation
 */
public class Collections {
    public static void main(String[] args) {
        
        //Une liste de type string 
        ArrayList <String> titres= new ArrayList <String>();
        titres.add("lalalal");
        titres.add("blabla");
        titres.add("jsjsjsjsjs");
        
        for (String liste_titres: titres){
            System.out.println(liste_titres);
    }
        //une liste qui n'a pas de type 
        /*ArrayList liste= new ArrayList();
        
        liste.add("La fierte des notres");
        liste.add(new Date());
        liste.add(10);
        for (Object liste_albums: liste){
            System.out.println(liste_albums);
    }*/
    
}
}
