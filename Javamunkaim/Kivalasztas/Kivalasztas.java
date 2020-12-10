/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalasztas;

import java.util.Scanner;

/**
 *
 * @author Márk
 */
public class Kivalasztas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        
        int [] tomb=new int[20];
        
        for (int i = 0; i < 20; i++) {
           tomb[i] = (int) (Math.random()*100)+1;
        }
        System.out.println("eredeti:");
        for (int i = 0; i < 20; i++) {
            System.out.print(tomb[i]+" ");
        }
        System.out.println("\n3-asával");
        for (int i = 3; i < 20; i+=3) {
            System.out.print(tomb[i]+" ");
        }
        
        System.out.print("\nMelyik elem sorszámára vagy kíváncsi? ");
        int keresettSzam = bemenet.nextInt();
        
        System.out.println("\n");
        int j = 0;
        for (int i = 0; i < 20; i++) {
            if (tomb[i] == keresettSzam){
                System.out.print("A keresett szám indexe: "+(i+1));
                break;
            }   
            j++;
            
        }
        
        if (20== j){
            System.out.println("Nem volt benne.");
        }
        
        
        
        
        System.out.println("\n");
        int i = 0;
        while(tomb[i] != keresettSzam){
            i++;
        }
        System.out.print("A keresett szám indexe: "+(i+1));
        
        
        bemenet.close();
    }
    
}
