/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2_bieres_chapelle;

/**
 *
 * @author 33769
 */
public class TP2_Bieres_CHAPELLE {
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        BouteilleBiere Biere1 = new BouteilleBiere ("Cuvée des trolls", 7.0, "Dubuisson");
        Biere1.lireEtiquette();
        System.out.println(Biere1);
        
        BouteilleBiere Biere2 = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        Biere2.lireEtiquette();
        System.out.println(Biere2);
        
        BouteilleBiere Biere3 = new BouteilleBiere ("Heineken", 5.0, "Abbaye de Heineken");
        Biere3.lireEtiquette();
        Biere3.Décapsuler();
        System.out.println(Biere3);
        
        BouteilleBiere Biere4 = new BouteilleBiere ("Desperados", 9.0, "Abbaye de Desperados");
        Biere4.lireEtiquette();
        
        BouteilleBiere Biere5 = new BouteilleBiere ("Guiness", 9.0, "Abbaye de Guiness");
        Biere5.lireEtiquette();
    }  
}
