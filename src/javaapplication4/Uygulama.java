/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Miroğlu
 */
public class Uygulama {

    public static void main(String[] args) {
        Mat m = new Mat();
        m.Yaz();
        int topla = m.Topla(10, 20);
        System.out.println(" 10+20=" + topla);
        System.out.println("10 un karesi="+m.Karesi(10));
        
    }
}
