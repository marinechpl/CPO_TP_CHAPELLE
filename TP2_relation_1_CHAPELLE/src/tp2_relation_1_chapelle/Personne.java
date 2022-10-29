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
    
    @Override // renvoie le nom et prénom de la personne 
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Prénom : "+prenom+"\nNom : "+nom;
        return chaine_a_retourner;
    }
    
    public boolean ajouter_voiture ( Voiture voiture_a_ajouter){
        if (voiture_a_ajouter.proprietaire!=null){
            return false;          
        }
        
        else if (nbVoitures >= 3){
            return false ; 
        }
        
        else {
            liste_voitures[nbVoitures]=voiture_a_ajouter;
            nbVoitures+=1;
            voiture_a_ajouter.proprietaire=this;
            return true;
        }
    }
    
}
