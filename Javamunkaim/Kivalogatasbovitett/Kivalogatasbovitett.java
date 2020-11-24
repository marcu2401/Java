/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatasbovitett;

/**
 *
 * @author Márk
 */
import java.util.Scanner;
public class Kivalogatasbovitett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kibővített\n");
       
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        
        System.out.print("Hány jegyet írjon ki? ");
        int darab=bemenet.nextInt();
        
        int[] jegyek=new int[darab];
        int[] egyesek=new int[darab];
        int[] kettesek=new int[darab];
        int[] harmasok=new int[darab];
        int[] negyesek=new int[darab];
        int[] otosok=new int[darab];
        
        System.out.println("\nÉrdemjegyek: ");
        
        for (int i = 0; i <darab; i++){
            jegyek[i]=(int)(Math.random()*5)+1;
            System.out.print(jegyek[i]+" ");
        }
        System.out.println("");
        
        int egyesekDb=0;
        int kettesekDb=0;
        int harmasokDb=0;
        int negyesekDb=0;
        int otosokDb=0;
        
        for (int i = 0; i < darab; i++){
            if (jegyek[i]==1){
                egyesek[egyesekDb++]=jegyek[i];
            }
            if (jegyek[i]==2){
                kettesek[kettesekDb++]=jegyek[i];
            }
            if (jegyek[i]==3){
                harmasok[harmasokDb++]=jegyek[i];
            }
            if (jegyek[i]==4){
                negyesek[negyesekDb++]=jegyek[i];
            }
            if (jegyek[i]==5){
                otosok[otosokDb++]=jegyek[i];
            }
        }
                
        System.out.print("\nEgyesek tömb elemei: ");
        for (int i = 0; i <egyesekDb; i++){
            System.out.print(egyesek[i]+" ");
        }
        System.out.print("\nKettesek tömb elemei: ");
        for (int i = 0; i <kettesekDb; i++){
            System.out.print(kettesek[i]+" ");
        }
        System.out.print("\nHármasok tömb elemei: ");
        for (int i = 0; i <harmasokDb; i++){
            System.out.print(harmasok[i]+" ");
        }
        System.out.print("\nNégyesek tömb elemei: ");
        for (int i = 0; i <negyesekDb; i++){
            System.out.print(negyesek[i]+" ");
        }
        System.out.print("\nÖtösök tömb elemei: ");
        for (int i = 0; i <otosokDb; i++){
            System.out.print(otosok[i]+" ");
        }
        System.out.println("\n\nEgyesek száma:"+egyesekDb);
        System.out.println("\nKettesek száma:"+kettesekDb);
        System.out.println("\nHármasok száma:"+harmasokDb);
        System.out.println("\nNégyesek száma:"+negyesekDb);
        System.out.println("\nÖtösök száma:"+otosokDb);
    }
    
}
