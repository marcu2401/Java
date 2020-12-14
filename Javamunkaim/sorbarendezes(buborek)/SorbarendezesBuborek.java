/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorbarendezes.buborek;

/**
 *
 * @author Márk
 */
import java.util.Scanner;
public class SorbarendezesBuborek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sorbarendezés Tétele Buborékos módszer\nJuhász Márk 113C\n");
        Scanner be;
        be=new Scanner(System.in); 
        System.out.println("Hány elemű tömbt szeretne létrehozni?");
        int elemszam=be.nextInt();
        int[] szamok=new int[elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            szamok[i]=(int) (Math.random()*100)-50;
            
            
        }
        
        System.out.println("Tömb elemei:");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(szamok[i]+" ");
        }
        
        for (int i = 0; i < elemszam-1; i++) {
            for (int j = 0; j <elemszam-i-1 ; j++) {
                 if (szamok[j]>szamok[j+1]){
                     int temp=szamok[j];
                     szamok[j]=szamok[j+1];
                     szamok[j+1]=temp;
                 }           
            }
        }
        System.out.println("\n");
        System.out.println("Rendezett tömbünk elemei: ");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(szamok[i]+" ");
            
        }
        System.out.println("\n");
        
       
        System.out.println("Negativ tömb elemei növekvő sorrendben:");
       
        for (int i = 0; i <szamok.length; i++) {
               if(szamok[i]<0){
                   System.out.print(szamok[i]);
                  }
        }
        System.out.println("\n");
        
        
        
        }  
        }
   
    
