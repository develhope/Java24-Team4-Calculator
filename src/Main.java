import java.util.Scanner;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("CA:_CU:_ATOR 0.1 ");

        System.out.println("Cosa vuoi fare?\n1. Per sapere se il è numero pari o dispai \n2. Per fare i Calcoli");
        System.out.println("Scrivi il numero corrispondente alla tua scelta e premi invio");
        Scanner selectInput = new Scanner(System.in);
        int select = selectInput.nextInt();
        if (select == 1) {
            pariDispari();
        } else if (select == 2) {
            recognitionAndCalculation();
        } else
            System.out.println("Input error!");
        System.out.println("ERRORE!");
    }

    public static void recognitionAndCalculation() {

        System.out.println("Inserisci il primo operatore");
        Scanner input1 = new Scanner(System.in);

        int num1 = input1.nextInt();
        System.out.println("Inserisci il secondo operatore");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        System.out.println("Inserisci operazione ( + | - | * | / | % | ^ |)");
        Scanner inputOper = new Scanner(System.in);
        String operation = inputOper.next();

        switch (operation) {
            case "+":
                System.out.println(num1 + "+" + num2 + "=" + (double) somma(num1, num2));
                break;
            case "-":
                System.out.println(num1 + "-" + num2 + "=" + (double) sottrazione(num1, num2));
                break;
            case "*":
                System.out.println(num1 + "*" + num2 + "=" + (double) moltiplicazione(num1, num2));
                break;
            case "/":
                System.out.println(num1 + "/" + num2 + "=" + (double) divisione(num1, num2));
                break;
            case "%":
                divizioneColResto(num1, num2);
                break;
            case "^":
                System.out.println(num1 + "^" + num2 + "=" + (double) potenza(num1, num2));
                break;
            default:
                System.out.println("Errore");
                break;
        }
    }

    public static void pariDispari() {
        Scanner inserisciNumero = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int numero = inserisciNumero.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero è pari");
        } else {
            System.out.println("Numero è dispari");
        }
    }

    public static double somma(double num1, double num2) {
        return num1 + num2;
    }
    public static double sottrazione(double num1, double num2) {
        return num1 - num2;

    }
    public static double moltiplicazione(int num1, int num2) {
        return num1 * num2;
    }
    public static double potenza(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
}