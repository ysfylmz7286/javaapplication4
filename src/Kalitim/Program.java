/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalitim;

/**
 *
 * @author Miroğlu
 */
public class Program {

    public static void main(String[] args) {
        Fayton fayton = new Fayton();
        fayton.setTekerlekSayisi(4);
        fayton.ilerle(8);
        
        Mobilet mobilet = new Mobilet();
        mobilet.setTekerlekSayisi(5);
        System.out.println("Mobilet teker sayısı : " + mobilet.getTekerlekSayisi());
        System.out.print("Faytonun " + fayton.getTekerlekSayisi()
                + " tekerleği var.");
    }
}
