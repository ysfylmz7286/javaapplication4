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
class Mat implements IArayuz,IArayuz2 {
        public void Yaz()
        {
            System.out.println("Arayuzden uygulanan Yaz metodu");
        }
        public int Topla(int deger1,int deger2) {
            return deger1+deger2;
        } 
        public int Karesi(int deger)
        {
            return deger*deger;
        }
        public int Kup(int deger)
        {
            return deger*deger*deger;
        }        
}


