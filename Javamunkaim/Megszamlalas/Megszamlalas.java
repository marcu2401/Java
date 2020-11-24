/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megszamlalas;

/**
 *
 * @author Márk
 */
public class Megszamlalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Osszegzes Juhász Márk 113/C");
      
        int[] tomb=new int[5];
        int szamlalo=0;
        int parosSzamlalo=0;
        int paratlan=0;
        for (int i = 0; i < 5; i++) {
            tomb[i]= (int) (Math.random()*99)+1;
            szamlalo++;
            if (tomb[i]%2==0) {
               parosSzamlalo++;
            }
            if(!(tomb[i]%2==0)){
              paratlan++;
            }
            }
        System.out.println("A tömb elemei: \n");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+". elem:"+" ");
            System.out.print(String.format("%,2d",tomb[i])+"\n");
             }
        System.out.println("");
        System.out.println(szamlalo+" elemű a tömb! \n");
        System.out.println("Ebben  a tömbben "+parosSzamlalo+" db páros szám van!");
        System.out.println("Ebben a tömbben "+paratlan+"db páratlan szám van!");
    }
    
}
