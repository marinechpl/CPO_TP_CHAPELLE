/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_chapelle;

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
        System.out.println(excali);
        Epée duran = new Epée ("Durandale", 4,7);
        System.out.println(duran);

        Bâton baton1 = new Bâton ("Chene", 4,5);
        System.out.println(baton1);
        Bâton baton2 = new Bâton ("Charme", 5,6);
        System.out.println(baton2);
        
    }
    
}
