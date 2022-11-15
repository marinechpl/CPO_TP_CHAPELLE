package Personnages;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 33769
 */
public class guerrier extends Personnages{
    boolean cheval ; 

    public guerrier(String nom, int vie, boolean cheval) {
        super(nom, vie);
        this.cheval = cheval;
    }

    @Override
    public String toString() {
        if (cheval==true){
            return "guerrier : " +nom+ " " + vie + " a cheval";
        } else {
        return "guerrier : " +nom+ " " + vie + " a pied";
        }
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    
    
}
