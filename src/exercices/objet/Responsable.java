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

    @Override
    public String toString() {
        return "Responsable{"+ super.toString() + "setEmploye=" + setEmploye + '}';
    }

    public LinkedHashSet<Employe> getSetEmploye() {
        return setEmploye;
    }

    public void setSetEmploye(LinkedHashSet<Employe> setEmploye) {
        this.setEmploye = setEmploye;
    }

   
    
}
