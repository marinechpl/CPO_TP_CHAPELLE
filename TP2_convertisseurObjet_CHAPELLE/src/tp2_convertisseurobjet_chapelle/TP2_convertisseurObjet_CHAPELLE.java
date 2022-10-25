/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_chapelle;

/**
 *
 * @author 33769
 */
public class TP2_convertisseurObjet_CHAPELLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur Conversion1 = new Convertisseur();
        Conversion1.CelciusVersFarenheit(32);
        Conversion1.KelvinVersCelcius(273.15);
        Conversion1.KelvinVersCelcius(1893);
        System.out.println(Conversion1);
        
        Convertisseur Conversion2 = new Convertisseur();
        Conversion2.KelvinVersFarenheit(372);
        Conversion2.CelciusVersKelvin(54);
        Conversion2.FarenheitVersCelcius(647);
        System.out.println(Conversion2); 
        
        
        
    }
    
    
}
