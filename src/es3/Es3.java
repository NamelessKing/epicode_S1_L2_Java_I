package es3;

import java.util.Scanner;

/*
Esercizio #3 - while
Scrivere un programma che chiede di inserire una stringa e la suddivida in caratteri separati dalla virgola.
Il programma si ripete fino a che l'utente non inserisce la stringa ":q".
* */
public class Es3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Inserisci una stringa (o ':q' per uscire):");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < input.length(); i++) {
                    result.append(input.charAt(i));
                    if (i < input.length() - 1) {
                        result.append(",");
                    }
                }
                System.out.println("Stringa suddivisa: " + result.toString());
            }

        } while (!input.equals(":q"));
        scanner.close();



    }
}
