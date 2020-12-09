/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keresztmetszet;

import java.util.Scanner;

/**
 *
 * @author Márk
 */
public class Keresztmetszet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nKeresztmetszet  Juhász Márk 113C\n");
        
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        char val;
        do{
        int elemszam=(int) (Math.random()*6)+5;
        
        int [] szamtomb1=new int[elemszam];
        int [] szamtomb2=new int[elemszam];
        int [] szamtomb3=new int[elemszam];
       
         for (int i = 0; i < elemszam; i++) {
           szamtomb1[i] = (int) (Math.random()*201)-100;           
           szamtomb2[i] = (int) (Math.random()*201)-100;   
           szamtomb3[i] = (int) (Math.random()*201)-100;   
        }
        
        System.out.println("Szamtomb1 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d",  szamtomb1[i])+" ");
        }
        System.out.println("\n");
        System.out.println("Szamtomb2 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d",  szamtomb2[i])+" ");
        }
        System.out.println("\n");
        System.out.println("Szamtomb3 tömb elemei:");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%,4d", szamtomb3[i])+" ");
        }
        System.out.println("\n");
        
        int db=1;
        
        for (int i = 0; i < elemszam; i++) {
            int osszeg=szamtomb1[i]+szamtomb2[i]+szamtomb3[i];
            System.out.println(db++ +".számok:"+szamtomb1[i]+"+"+szamtomb2[i]+"+"+szamtomb3[i]+"="+osszeg );
            
        }
        System.out.println("\n");
        int index=2;
        
        System.out.println("Legkisebb számok (indexenként):");
        for (int i = 0; i <=elemszam; i++) {
            if(index>elemszam || index>elemszam-1  ){break;}
            else if (szamtomb1[index]<szamtomb2[index] && szamtomb1[index]<szamtomb3[index]){
              System.out.println(String.format("Legkisebb:"+szamtomb1[index])+" ("+index+".)");
              index+=2;
            }
            else if (szamtomb2[index]<szamtomb1[index] && szamtomb2[index]<szamtomb3[index]){
               System.out.println(String.format("Legkisebb:"+szamtomb2[index])+" ("+index+".)");
               index+=2;
            }
            else if (szamtomb3[index]<szamtomb1[index] && szamtomb3[index]<szamtomb2[index]){
               System.out.println(String.format("Legkisebb:"+szamtomb3[index])+" ("+index+".)");
               index+=2;
            }

        }
            
            int [] teljes=new int [elemszam*3];
            int teljesTombdb = 0;
          
            
            for (int i = 0; i < elemszam; i++) {
               teljes[teljesTombdb++] += szamtomb1[i];
               teljes[teljesTombdb++] += szamtomb2[i];
               teljes[teljesTombdb++] += szamtomb3[i];
            }
        
            for (int i = 0; i < teljesTombdb-1; i++) {
                for (int j = 0; j <teljesTombdb-i-1 ; j++) {
                     if (teljes[j]>teljes[j+1]){
                         int csere=teljes[j];
                         teljes[j]=teljes[j+1];
                         teljes[j+1]=csere;
                 }           
            }
        }
            System.out.println("\nA teljesTomb elemei:");
            for (int i = 0; i < teljesTombdb; i++) {
               System.out.print(String.format("%,4d", teljes[i]) + " ");

      }
            System.out.println("\n");
            System.out.println("Több is szerepel belőlük a teljes tömbben:");
            
            int len=-1;
            int ho=0;
            for (int j = 0; j < teljesTombdb-1 ; j++) {
                if (teljes[j]==teljes[j+1]){
                     len+=1;   
                     ho+=1;
                     int tobb [] =new int[ho];
                     tobb[len]+=teljes[j];
                     System.out.println(tobb[len]+" ");
                 }
                     }
            if (len==-1){System.out.println("Nincs ilyen szam!");}
               
                            
           
            
            
        
           
           
        
            System.out.println("\n");
            System.out.print("Szeretnéd újra futtatni a programot? Ha igen üss egy 'i' betűt!\nHa nem üss egy 'n' karaktert!");
            val = bemenet.nextLine().toLowerCase().charAt(0);
            }while (val == 'i');  
            bemenet.close();
         
            
        }
       
        
    }
    

