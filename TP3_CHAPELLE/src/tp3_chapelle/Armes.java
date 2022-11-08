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
    
    public class épée extends Armes {
        int finesse;
        
        public épée (String unNom, int attaque, int finS){
            super(unNom, attaque);
            finesse = finS;
            if (finS >= 100) {
                finS = 0 ;
            }
        }   
    } 
    
    public class bâton extends Armes {
        int âge;
        
        public bâton (String unNom, int attaque, int Age){
            super(unNom, attaque);
            âge = Age ;
            if (Age >= 100){
                Age = 0 ; 
            }
        }
    }
    @Override
    public String toString() { 
    String chaine_a_retourner;
    chaine_a_retourner = nom + niveau_attaque ;
    return chaine_a_retourner ;
    }
    
    
    
    
}
