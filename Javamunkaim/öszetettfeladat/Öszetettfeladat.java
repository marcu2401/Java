/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package öszetettfeladat;

/**
 *
 * @author Márk
 */
import java.util.Scanner;
public class Öszetettfeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//1. Hozz létre két tömböt: szamok1, szamok2 néven!
//2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
//3. Az elemek a -50 és +50 értéktartományba essenek.
//4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
//5. Helyezd át a két tömb öttel osztható páros számait egy ujtomb nevű tömbbe, majd írasd ki sorbarendezve.
//6. Írasd ki a legkisebb és legnagyobb számot az ujTomb-ből.
//7. Írasd ki, többszöröse-e a legnagyobb szám a legkisebbnek?
//8. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
//9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
        
        System.out.println("\nÖszetett feladat Juhász Márk 113C\n");
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        char val;
        do{
        int elemszam=(int) (Math.random()*21)+10;
        
        
        int [] szamok1=new int[elemszam];
        int [] szamok2=new int[elemszam];
        
        for (int i = 0; i < elemszam; i++) {
           szamok1[i] = (int) (Math.random()*101)-50;           
           szamok2[i] = (int) (Math.random()*101)-50;               
        }
        System.out.println("Számok1 tömb elemei:");
       for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i])+" ");
        }
        System.out.println("\n");
        System.out.println("Számok2 tömb elemei:");
         for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i])+" ");
        }
         
        System.out.println("\n");
        int ujTomb[] = new int[elemszam];
        int ujTombdb = 0;
        for (int i = 0; i < elemszam; i++) {
            if (szamok1[i] % 5 == 0 && szamok1[i]%2==0) {
                ujTomb[ujTombdb++] = szamok1[i];
            }
            if (szamok2[i] % 5 == 0 && szamok2[i]%2==0) {
                ujTomb[ujTombdb++] = szamok2[i];
            }

        }
        System.out.println("\nAz ujTomb elemei:");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
            
        }
        
        for (int i = 0; i < ujTombdb-1; i++) {
            for (int j = 0; j <ujTombdb-i-1 ; j++) {
                 if (ujTomb[j]>ujTomb[j+1]){
                     int csere=ujTomb[j];
                     ujTomb[j]=ujTomb[j+1];
                     ujTomb[j+1]=csere;
                 }           
            }
        }
        System.out.println("\n");
        System.out.println("Rendezett ujTomb elemei:");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i])+" ");
            
        }
        System.out.println("\n");
        
        System.out.println("A legkisseb szam az ujTomb bol: "+ujTomb[0]);
        System.out.println("A legnagyobb szam az ujTomb bol: "+ujTomb[ujTombdb-1]);
         
        
        if(ujTomb[ujTombdb-1]%ujTomb[0]==0){
            System.out.println("A legnagyobb szám többszöröse a legkisebbnek!");
        }
        else{
            System.out.println("A legnagyobb szám nem többszöröse a legkisebbnek!");
        }
          System.out.println("\n");
        for (int i = 0; i < ujTombdb; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("Az ujTomb tartalmaz 0-t");
            }
        }
        System.out.println("\n");
        System.out.print("Szeretnéd újra futtatni a programot? Ha igen üss egy 'i' betűt!\nHa nem üss egy 'n' karaktert!");
        val = bemenet.nextLine().toLowerCase().charAt(0);
        }while (val == 'i');  
        bemenet.close();
}   
}

    

