/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author 33769
 */
public class Personnages {
    String nom;
    int vie;

    public Personnages(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    @Override
    public String toString() {
        return "Personnages " + "nom = " + nom + ", vie = " + vie ;
    }
    
    
    
    
}
