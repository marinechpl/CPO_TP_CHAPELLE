/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_chapelle;

/**
 *
 * @author 33769
 */
public class TP2_relation_1_CHAPELLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
    
    Personne Bob = new Personne("Bobby", "Sixkiller");
    Personne Reno = new Personne("Reno", "Raines");

    System.out.println("liste des voitures disponibles : \n"+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
    
    Bob.liste_voitures [0]=uneClio;
    Bob.liste_voitures[1]=une2008;
    Bob.nbVoitures = 2 ;
    uneClio.proprietaire = Bob ;
    une2008.proprietaire=Bob;
    
    Reno.liste_voitures[0]=uneMicra;
    Reno.nbVoitures=1;
    uneMicra.proprietaire=Reno;
    
    Reno.ajouter_voiture(uneAutreClio);
    
    
    
    
    System.out.println(
            "la premiere voiture de Bob est " + Bob.liste_voitures[0] 
            + " Sa deuxieme voiture est " + Bob.liste_voitures[1] ) ;
    System.out.println(
            "la premiere voiture de Reno est " + Reno.liste_voitures[0] 
            + " Sa deuxieme voiture est " + Reno.liste_voitures[1] 
            + "(" + Reno.nbVoitures + ")") ;
    
    
    }
    
}
