package es2;

import java.util.Scanner;

/*
Esercizio #2 - switch
Scrivere un programma che chiede un intero in ingresso e lo stampa in lettere se il valore è compreso tra 0 e 3,
altrimenti stampa un messaggio d'errore usando il costrutto switch.
* */
public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero =  scanner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Errore: il numero deve essere compreso tra 0 e 3.");
        }
    }
}
