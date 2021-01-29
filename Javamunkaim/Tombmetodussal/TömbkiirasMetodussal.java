/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tömbkiirasmetodussal;

/**
 *
 * @author Márk
 */
public class TömbkiirasMetodussal {
    
    public static void kiir (int [] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(String.format("%,4d", tomb[i])+" ");
        }
        System.out.println("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Juhász Márk 113C Metodussal tömbkiiratás\nKomoly meló! ");
       
        
        
        int [] szamok1=new int[10];
        int [] szamok2=new int[10];
        int [] szamok3=new int[10];
        
        for (int i = 0; i < 10; i++) {
            szamok1[i] = (int) (Math.random()*201)-100;           
            szamok2[i] = (int) (Math.random()*201)-100;  
            szamok3[i] = (int) (Math.random()*201)-100;  
        }
        
        System.out.print("A számok1 tömb elemei:");
             kiir(szamok2);
        System.out.print("A számok2 tömb elemei:");
             kiir(szamok2);
        System.out.print("A számok3 tömb elemei:");
             kiir(szamok3);
      
    }
    
}
