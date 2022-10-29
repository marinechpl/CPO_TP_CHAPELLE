/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_chapelle;

/**
 *
 * @author 33769
 */
public class Voiture {
    String modele ;
    String marque ;
    int puissance ;
    Personne proprietaire ;
    
    public Voiture (String Modele, String Marque, int Puissance) {
    modele = Modele ;
    marque = Marque ;
    puissance = Puissance ;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "une " + marque+ " "+ modele
                +" avec une puissance de " + puissance + " CV."; // on veut la chaine qui correspond à l'objet voiture 
        return chaine_a_retourner;
    }
}

