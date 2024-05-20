//! esercizio 1
// Scrivere un programma che, preso in input da tastiera una stringa e un numero, 
// stampa il carattere che si trova nella posizione indicata dal numero preso in input.

// Esempio

// Original String = Java Exercises!

// The character at position 0 is J

// The character at position 10 is i

// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("inserisci stringa");
//         String str = scan.nextLine();

//         System.err.println("inserisci posizione indice della lettera");
//         int num = scan.nextInt();

//         char r = str.charAt(num);

//         System.out.println("la lettera alla psizione " + num + " è " + r);

//     }
// }

//! Esercizio 2

// Scrivere un programma che, preso una stringa e un carattere in input, stampi la posizione di quel carattere nella stringa.

// Esempio

// Original String : pippo

// Character: p

// posiction: 0
import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("inserisci stringa");
            String str = scan.nextLine();
    
            System.err.println("inserisci carattere da cercare");
            String chara = scan.nextLine();
      
            int position = str.indexOf(chara);
           
            System.out.println("il carattere inserito " + chara + " si trova: " + position );
    
        }
    }