package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 33769
 */
public class magicien extends Personnages{
    boolean confirme;

    public magicien(String nom, int vie, boolean confirme) {
        super(nom, vie);
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        if (confirme == true ){
            return "magicien : "+ nom + " "+ vie + " confirme";
        }else {
            return "magicien : "+ nom + " "+ vie + " débutant";
        }
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    
    
}
