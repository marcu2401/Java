/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;
/**
 *
 * @author Márk
 */
public class MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Juhász Márk József 113C MENU");
        
    /*    5. Ekkor kérdezd meg a felhasználót, mit szeretne tenni az adatokkal:
     1 - összeget számoltatni: tömbök összegét kiíratni
     2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni
     3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?
     4 - 5-tel osztható páros számok db-száma: mennyi?
     5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.

!!!!!!! Adatbevitelnél mindig oldd meg, hogy csak azokkal az elemekkel engedje tovább a program a felhasználót, amelyek a tömb elemi között szerepelnek! */
        
        
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        
        
         int [] szamok=new int[20];
         
         for (int i = 0; i < 20; i++) {
           szamok[i] = (int) (Math.random()*100)-50;
        }
	 System.out.println("A szamok tomb elemei: ");
         for (int i = 0; i < 20; i++) {
            System.out.print(szamok[i]+" ");
        }
         
        char valasz;
        int val1;
        do{ 
        System.out.println("\n");
       
      
      
        
        System.out.println("Mit szeretne tenni az adatokkal?");    
        System.out.println("1 - összeget számoltatni: tömbök összegét kiíratni\n" +
        "2 - szélsőértékeket kiíratni: legkisebb és legnagyobb értéket kiíratni\n" +
        "3 - van-e benne 40-50: megtudni, tartalmaz-e számot 40 és 50 között?\n" +
        "4 - 5-tel osztható páros számok db-száma: mennyi?\n" +
        "5 - adott számot tartalmazza-e: egy felhasználótól bekért számról mondja meg, h tartalmazza-e a tömb, s ha igen, mi az indexe.\n");
        
        System.out.println("Írd be a megfelelő számot:\n ");
        val1 = bemenet.nextInt();
        
        
        if (val1==1){
        int osszeg=0;
        for (int i = 0; i < 20; i++) {
             osszeg+=szamok[i];
             }
        System.out.println("A számok összege: "+osszeg);
        
        }
        if (val1==2){
        
        
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 20-i-1; j++) {
                if (szamok[j]>szamok[j+1]){
                int csere=szamok[j];
                szamok[j]=szamok[j+1];
                szamok[j+1]=csere;
              }
            }
            
        }
        System.out.println("A legkisseb szám a tömbben: "+szamok[0]);
        System.out.println("A legnagyobb szám a tömbben:"+String.format("%,4d",szamok[szamok.length-1]));
        }   
        if (val1==3){
        boolean tartalmaz=false;
        
            for (int i = 0; i < 20; i++) {
                if (szamok[i] >40 && szamok[i]<50){
                   tartalmaz=true;
                 }
        }
            if(tartalmaz==true) {
                 System.out.println("Tartalmaz 40 és 50 közöttti számot!");
        }
            else{
                System.out.println("Nem tartalmaz 40 és 50 közöttti számot! ");
            }
        
        }
        
        if (val1==4) {
            int paros=0;
            for (int i = 0; i < 20; i++) {
                if(szamok[i]%5==0 && szamok[i]%2==0){
                    paros+=1;
                 }
                
            }
            System.out.println("Ennyi páros 5 el osztható szám van: "+paros);     
          }
        
         if (val1==5){
             System.out.println("Kérlek írj be egy számot és megmondom tartalmazza-e a tömbünk! :)\n"
              +"írd ide a számod:");
            int szamod=bemenet.nextInt();
             
             
            for (int i = 0; i < 20; i++) {
                if (szamod==szamok[i]){
                    System.out.println("Tartalmazza és az indexe "+i);     
                             
                          }
         }
           
    }
            bemenet.nextLine();
            System.out.print("Szeretnéd újra futtatni a programot? Ha igen üss egy 'i' betűt! Ha nem üss egy 'n' karaktert!\n");
            valasz = bemenet.nextLine().toLowerCase().charAt(0);
            }while (valasz == 'i');  
            bemenet.close();
            
   } 

 }
    
