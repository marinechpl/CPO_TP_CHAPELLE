/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2_bieres_chapelle;

/**
 *
 * @author 33769
 */
public class BouteilleBiere {
    String nom ;
    Double degreAlcool ;
    String brasserie ;
    Boolean ouverte ;
    
    public BouteilleBiere(String unNom, Double unDegre, String
uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }
@Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}
    
public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
}

public void Décapsuler(){
    if (ouverte==false){
        ouverte=true ;
    }else {
        System.out.println("Erreur : bière déjà ouverte");
    }      
}


}


