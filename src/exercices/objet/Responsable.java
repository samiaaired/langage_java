/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

import java.util.LinkedHashSet;

/**
 *
 * @author formation
 */
public class Responsable extends Employe {
   private  LinkedHashSet <Employe> setEmploye= new LinkedHashSet<>();

    public Responsable(String nom, String prenom, double salaire) {
        super(nom, prenom, salaire);
    }

   

    @Override
    public String toString() {
        //return "Responsable{"+ super.toString() + "Employe=" +employes+ '}';
        return String.format ("Responsable: %s Liste de s employés: %s",
        super.toString(),
          this.setEmploye    );    
    }

    public LinkedHashSet<Employe> getSetEmploye() {
        return setEmploye;
    }

    public void setSetEmploye(LinkedHashSet<Employe> setEmploye) {
        this.setEmploye = setEmploye;
    }

   
    
}
