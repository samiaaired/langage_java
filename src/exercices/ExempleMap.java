/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author formation
 */
public class ExempleMap {
    
    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<>();
        
        //Ajouer 2 élements dans Map
        map.put("intrinsèque","Qui est inhérent à quelque chose ou à quelqu'un,qui lui est en propre");
        map.put("ésotérique","Qui ne peut âtre compris que par les initiés");
        
        
        //Affichage de la définition de ésotirique
        //String m=map.get("ésotérique");
      //  System.out.println("Esotérique="+map.get("ésotérique"));
        
        //1.itérer sur toutes les clé et affiche chaque clé et sa définition
        
        Set <String> cles= map.keySet();
        for (String cle:cles){ //ou directement et sans variables intermédiares : for (String cle:map.keySet
           System.out.println(cle + ":" +map.get(cle));
            System.out.println("******");
           
    }
        //2.supprimer isotérique
        map.remove("ésotérique");
        
        //3..0affichage du map
        System.out.println(map);
        System.out.println("******");
    }
    
}
