/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_chapelle;

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
    String chaine_a_retourner;
    chaine_a_retourner = "Arme : "+ nom + "; Niveau d'attaque : " + niveau_attaque ;
    return chaine_a_retourner ;
    }
    
    
    
    
}
