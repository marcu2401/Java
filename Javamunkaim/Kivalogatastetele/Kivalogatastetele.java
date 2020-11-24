/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatastetele;

/**
 *
 * @author Márk
 */
import java.util.Scanner;
public class Kivalogatastetele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        
        System.out.println("KIVÁLOGATÁS TÉTELE\n");
        
        int darab;
        
        System.out.print("Hány jegyet írjon ki? ");
        darab = bemenet.nextInt();
            
        int erdemjegyek[]= new int [darab];       
        int masolat [] = new int [darab];
        
        for (int i = 0; i < darab; i++) {
            erdemjegyek[i]= (int)(Math.random()*4)+1;
        }
        System.out.print("jegyek: ");
        for (int i = 0; i < darab; i++) {
            System.out.print(erdemjegyek[i]+" ");
        }
        
        System.out.println("");
        
        int kettesekdb=0;
        for (int i = 0; i < darab; i++) {
            if (erdemjegyek[i]==2) {
                masolat[kettesekdb++]=erdemjegyek[i];
            }
        }
        System.out.print("Másolat tömb elemei: ");
        
            if (kettesekdb > 0){
                for (int i = 0; i < kettesekdb; i++) {
                    System.out.print(masolat[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 2-es");
            }
        
        System.out.println("\nKettesek száma: "+kettesekdb);
        
        
        
        bemenet.close();
    }
    
}
