/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_chapelle;

import Armes.Epée;
import Armes.Armes;
import Armes.Bâton;
import Personnages.Personnages;
import Personnages.guerrier;
import Personnages.magicien;
import java.util.ArrayList;

/**
 *
 * @author 33769
 */
public class TP3_CHAPELLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Epée excali = new Epée ("Excalibur", 7, 5);
        Epée duran = new Epée ("Durandale", 4,7);

        Bâton baton1 = new Bâton ("Chene", 4,5);
        Bâton baton2 = new Bâton ("Charme", 5,6);
        
        ArrayList<Armes> liste = new ArrayList<Armes>();
        liste.add(baton1);
        liste.add(excali);
        liste.add(duran);
        liste.add(baton2);
        
        System.out.println (liste);
        
        
        magicien M1 = new magicien ("Gandalf", 65, true);
        magicien M2 = new magicien ("Garcimore", 44, false);
        
        guerrier G1 = new guerrier ("Conan", 78, false);
        guerrier G2 = new guerrier ("Lannister",45, true);
        
        ArrayList<Personnages> perso = new ArrayList<Personnages>();
        perso.add(M1);
        perso.add(M2);
        perso.add(G1);
        perso.add(G2);
        
        System.out.println(perso);
        
    }
    
}
