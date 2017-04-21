/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

/**
 *
 * @author formation
 */
public class Tableaux {

    public static void main(String[] args) {
        String[][] tab;
        tab = new String[10][10];
        int i, j=0;
  

        for (i = 0; i < tab.length; i++) {
            for (j=0; j <tab[i].length; j++) {
                tab[i][j] = "*";
                  System.out.print(tab[i][j]);
                
            }
             System.out.println("");
        }
       
    }
}
