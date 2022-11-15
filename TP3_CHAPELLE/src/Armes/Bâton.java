/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author 33769
 */
public class Bâton extends Armes {
        int âge;
        
        public Bâton (String unNom, int attaque, int Age){
            super(unNom, attaque);
            âge = Age ;
            if (Age >= 100){
                Age = 0 ; 
            }
        }
    }