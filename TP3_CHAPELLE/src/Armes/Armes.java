/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author 33769
 */
public class Armes {
    String nom; 
    int niveau_attaque;
    
    public Armes(String unNom, int attaque){
        nom = unNom ;
        niveau_attaque = attaque;
        
        if (attaque > 100 && attaque <0 ) {
            attaque = 0 ;
        }
    }

    @Override
    public String toString() {
        return "Armes(" + "nom=" + nom + ", niveau_attaque=" + niveau_attaque + ')';
    }
   
    
    
    
    
}
