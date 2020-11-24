/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombmuveletek;

/**
 *
 * @author Márk
 */
import java.util.Scanner;

public class Tombmuveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2 tömb
        felhasznalo mondja meg hany elemű legyen 
        kiiratas  
        1-100 között
         */
        System.out.println("Tömbműveletek Juhász Márk 113C");
        Scanner be;
        be=new Scanner(System.in);
        
        System.out.println("Adja meg hány db számból álljanak  a tömbök:");
        int n=be.nextInt();
        
        int tomb1[]=new int[n];
        int tomb2[]=new int[n];
        
        
        for (int i = 0; i < n; i++) {
            tomb1[i]=(int) (Math.random()*999)+1;
            tomb2[i]=(int)(Math.random()*999)+1;
            
        }
        System.out.print("A tömbök elemei: \n");
        for (int i = 0; i < n; i++) {
            int sorOsszeg=0;
            sorOsszeg=tomb1[i]+tomb2[i];
            System.out.print(i+1+".: ");
            System.out.print(String.format("%,3d",tomb1[i])+" + ");
            System.out.print(String.format("%,3d",tomb2[i])+" = ");
            System.out.print(String.format("%,5d",sorOsszeg));
            System.out.println("");
        }
    }
}
