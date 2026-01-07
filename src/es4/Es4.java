package es4;

/*
#Esercizio #4 - for
Scrivere un programma che chiede all'utente di inserire un numero intero e stampi il conto alla rovescia a partire da quel numero fino a zero
* */
public class Es4 {
    public static void main(String[] args) {

        int numero = 10; // Esempio di numero intero

        System.out.println("Conto alla rovescia da " + numero + " a 0:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
