package es1;

/*
Esercizio #1 - if-else if
Scrivere i seguenti metodi:

stringaPariDispari, che accetta una stringa e ritorna true se il numero di caratteri è pari e false se il numero di caratteri è dispari.

annoBisestile, che accetta un anno espresso come intero e ritorna true se esso è bisestile, false altrimenti.
[Un anno per essere bisestile deve rispettare le seguenti regole:

essere divisibile per 4

qualora sia divisibile per 100 deve essere anche divisibile per 400
]
Scrivere un main che utilizzi i metodi.
*/
public class Es1 {
    public static void main(String[] args) {
        String testString1 = "Hello";
        String testString2 = "Hello!";
        int testYear1 = 2020;
        int testYear2 = 1900;
        int testYear3 = 2000;

        System.out.println("La stringa \"" + testString1 + "\" ha un numero di caratteri pari? " + stringaPariDispari(testString1));
        System.out.println("La stringa \"" + testString2 + "\" ha un numero di caratteri pari? " + stringaPariDispari(testString2));

        System.out.println("L'anno " + testYear1 + " è bisestile? " + annoBisestile(testYear1));
        System.out.println("L'anno " + testYear2 + " è bisestile? " + annoBisestile(testYear2));
        System.out.println("L'anno " + testYear3 + " è bisestile? " + annoBisestile(testYear3));
    }


    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 != 0) {
            return false;
        } else return anno % 100 != 0 || anno % 400 == 0;
    }

}
