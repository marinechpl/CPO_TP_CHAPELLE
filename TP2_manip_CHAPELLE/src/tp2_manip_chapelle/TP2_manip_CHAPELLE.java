/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_chapelle;

/**
 *
 * @author 33769
 */
public class TP2_manip_CHAPELLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tartiflette assiette1 = new Tartiflette(30);
        Tartiflette assiette2 = new Tartiflette(700);
        Tartiflette assiette3 = assiette2 ; 
        assiette2=assiette1;
        assiette1=assiette3; //échange des valeurs des 2 assiettes 
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;
        
        
        Moussaka Tab [] = new Moussaka[10]; //création du tableau avec 1à cases 
        for (int i=0;i<10;i++){ //boucle pour les 10 cases du tableau
        Tab[i]=new Moussaka(i);
        }
    }
}