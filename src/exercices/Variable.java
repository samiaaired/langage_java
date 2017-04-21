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
public class Variable {

    public static void main(String[] args) {

        //Entiers 
//        byte b = 1;
//        short s = 32000;
//        int i = 123;
//        long l = 123456789;
//
//        //Decimal 
//        double d = 123.3256;
//        //en premier lieu quand tu declares float pour java c un chifre double donc il faut faire (float)
//        float f = (float) 123.456;
//
//        // Texte 
//        //String type évolué donc le s est en majuscule 
//        String str = "coucou";
//
//        //booléen 
//        boolean bool = true;
//
   // System.out.println( afficheCalcule(2,3));
    
    System.out.println("Entrer un texte:");
   
        Scanner scanner= new Scanner(System.in );
        
        //String txtConsole = scanner.next();
        String textConsole= scanner.nextLine();
        System.out.println("Vous avez entré:" + textConsole );

    }

    public static long afficheCalcule(long n, long exp) {
        long calcul = 1;

        for (int i = 1; i <= exp; i++) {

            calcul = calcul * n;

        }
        return calcul;
    }
}
