/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kettomb;

/**
 *
 * @author Márk
 */
public class Kettomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kettomb feladat Juhász Márk 113C");
        System.out.println("\n");
        int tomb1[] = {23,24,51,76,12};
        int tomb2[] = new int [5];
        for(int i=0; i<5; i++){
        tomb2[i] = (int) ((Math.random()*99)+1);
        }
        for(int i=0; i<5; i++){
            System.out.print("Az első tömb "+(i+1)+". tagja: ");
            if(tomb1[i]>9){
                System.out.print(tomb1[i]+" A második tömb "+(i+1)+" tagja: ");
            }
            else{
                System.out.print(" "+tomb1[i]+" A második tömb  "+(i+1)+" tagja: ");
            }
            if(tomb2[i]>9){
                System.out.print(tomb2[i]);
            }
            else{
                System.out.print(" "+tomb2[i]);
            }
            if(tomb1[i]>tomb2[i]){
                System.out.println(" Az első tömb eleme nagyobb "+(tomb1[i]-tomb2[i]+"-el/al mint a 2. tömb eleme"));
            }
            else if(tomb1[i]==tomb2[i]){
                System.out.println("A tömbök ellemei megegyeznek");
            }
            else{
                System.out.println(" A 2. tömb eleme nagyobb "+(tomb2[i]-tomb1[i]+"-el/al mint az 1. tömb eleme"));
            }
        
        }
    }
    
}
