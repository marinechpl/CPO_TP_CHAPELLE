/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_chapelle;

/**
 *
 * @author 33769
 */
public class Personne {
    String nom;
    String prenom ;
    Voiture [] liste_voitures;
    int nbVoitures;
    
    public Personne (String Nom, String Prenom) {
        nom = Nom;
        prenom = Prenom ;
        liste_voitures= new Voiture[3];
        nbVoitures=0;
    }
    
}
