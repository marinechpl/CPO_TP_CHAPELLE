/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_chapelle;

/**
 *
 * @author 33769
 */
public class Epée extends Armes {
        int finesse;
        
        public Epée (String unNom, int attaque, int finS){
            super(unNom, attaque);
            finesse = finS;
            if (finS >= 100) {
                finS = 0 ;
            }
        }   
    } 