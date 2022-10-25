/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_chapelle;
import java.util.Scanner;
/**
 *
 * @author 33769
 */
public class TP2_convertisseurObjet_CHAPELLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur Conversion = new Convertisseur();
        //Conversion1.CelciusVersFarenheit(32);
        //Conversion1.KelvinVersCelcius(273.15);
        //Conversion1.KelvinVersCelcius(1893);
        //System.out.println(Conversion1);
        
        //Convertisseur Conversion2 = new Convertisseur();
        //Conversion2.KelvinVersFarenheit(372);
        //Conversion2.CelciusVersKelvin(54);
        //Conversion2.FarenheitVersCelcius(647);
        //System.out.println(Conversion2); 
        
        System.out.println("""
                           1.Celcius vers Farenheit
                           2.Celcius vers Kelvin
                           3.Kelvin vers Celcius
                           4.Kelvin vers Farenheit
                           5.Farenheit Vers Celcius
                           6.Farenheit vers Kelvin""");
        
        System.out.println("Entrez votre choix : ");
        Scanner saisie = new Scanner(System.in);
        double choix = saisie.nextDouble(); //création de la variable choix pour les entrées utilisateur
        if (choix==1){ //différent type de choix : les définir un par un 
            System.out.println("Entrer une valeur:");
            double temp=saisie.nextDouble(); //création val=riable température 
            System.out.println("Valeur en Farenheit ="+ Conversion.CelciusVersFarenheit(temp)); //affciher le message avec le renvoie a la méthode dans l'objet pour convertir 
            }
        else if (choix==2){
            System.out.println("Entrer une valeur:");
            double temp=saisie.nextDouble();
            System.out.println("Valeur en Kelvin ="+ Conversion.CelciusVersKelvin(temp));
            }
        else if (choix==3){
            System.out.println("Entrer une valeur:");
            double temp =saisie.nextDouble();
            System.out.println("Valeur en Celcius ="+ Conversion.KelvinVersCelcius(temp));
            }
        else if (choix==4){
            System.out.println("Entrer une valeur:");
            double temp =saisie.nextDouble();
            System.out.println("Valeur en Farenheit ="+ Conversion.KelvinVersFarenheit(temp));
        }
        else if (choix==5){
            System.out.println("Entrer une valeur:");
            double temp =saisie.nextDouble();
            System.out.println("Valeur en Celcius ="+ Conversion.FarenheitVersCelcius(temp));
        }
        else if (choix==6){
            System.out.println("Entrer une valeur:");
            double temp =saisie.nextDouble();
            System.out.println("Valeur en Kelvin ="+ Conversion.FarenheitVersKelvin(temp));
        }
        }
}