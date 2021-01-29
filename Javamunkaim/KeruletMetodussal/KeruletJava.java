/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kerulet.java;
import java.util.Scanner;

/**
 *
 * @author Márk
 */
public class KeruletJava {
    
    
    static int teglalapKerulet(int a, int b){
        return 2*(a+b);
    }
    static int otszogKerulet(int a){
        return 5*a;
    }
    static double korKerulet(double r){
        double area=(22*r*r)/7;
        return area;
    }
    static int haromszogKerulet(int a, int b, int c){
        return a+b+c;
    }
    static int hatszogKerulet(int a){
        return 6*a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bemenet;
        bemenet=new Scanner(System.in);
        
        char valasz;
        do{ 
        
        System.out.println("Minek a kerületét szeretnéd kiszámolni?\n1-téglalap\n2-kör\n3-háromszög\n4-szabályos ötszög\n5-szabályos hatszög\nÍrj be egy számot:");
        int szam=bemenet.nextInt();
        while(szam>6 &&szam<0){
           System.out.println("Kérlek írj be egy megfelelő számot!");
           System.out.println("Próbáld újra:");
           szam=bemenet.nextInt();
        }
            switch (szam) {
                case 1 ->                     {
                        System.out.println("Ird be a téglalap 'a' oldalát: ");
                        int a=bemenet.nextInt();
                        System.out.println("Ird be a téglalap 'b' oldalát: ");
                        int b=bemenet.nextInt();
                        System.out.println("A téglalap kerülete: "+teglalapKerulet(a,b));
                    }
                case 2 -> {
                    System.out.println("Ird be a kör sugarát: ");
                    int r=bemenet.nextInt();
                    System.out.println("A kör kerülete: "+korKerulet(r));
                }
                case 3 ->                     {
                        System.out.println("Ird be a háromszög 'a' ");
                        int a=bemenet.nextInt();
                        System.out.println("Ird be a háromszög 'b' ");
                        int b=bemenet.nextInt();
                        System.out.println("Ird be a háromszög 'c' ");
                        int c=bemenet.nextInt();
                        System.out.println("A háromszog kerülete: "+haromszogKerulet(a,b,c));
                    }
                
                case 4 ->                     {
                        System.out.println("Ird be az ötszög 'a' oldalát:");
                        int a=bemenet.nextInt();
                        System.out.println("Az ötszög kerülete: "+otszogKerulet(a));
                    }
                case 5 ->                     {
                        System.out.println("Ird be a hatszög 'a' oldalat: ");
                        int a=bemenet.nextInt();
                        System.out.println("A hatszög  kerülete: "+hatszogKerulet(a));
                    }
                default -> {
                    
                }
            }
       
            bemenet.nextLine();
            System.out.println("Szeretnéd újra próbálni?\nHa igen üss egy 'i' ha nem egy 'n' betűt:");
            valasz = bemenet.nextLine().toLowerCase().charAt(0);
        }while (valasz == 'i');  
        bemenet.close();
       
    }
    
}
