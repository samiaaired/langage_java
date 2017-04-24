package exercices.objet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author formation
 */
public class ClasseStatique {
    // le bloc static s'execute en premier 
    static{
        singleton=null;
        nbInstances=0;
    }
   
   private static ClasseStatique singleton ; 
   private static int nbInstances =0;
   //public String titre;
    private  ClasseStatique(){
       nbInstances++;
   }
      public static void afficheNbInstances(){
          System.out.println("Intances: " + ClasseStatique.nbInstances);
      } 
      
      public static ClasseStatique geInstance(){
          
          if(singleton!=null)//si déjà différent de null, alors il existe déjà 
          return singleton;
          
          //exite pas encore 
          singleton= new ClasseStatique();
          return singleton;
      }
        
    }
    
    
