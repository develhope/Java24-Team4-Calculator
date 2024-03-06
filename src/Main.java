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
            System.out.println("ERRORE!");
    }

    public static void recognitionAndCalculation() {

        System.out.println("Inserisci il primo operatore");
        Scanner input1 = new Scanner(System.in);

        double num1 = input1.nextDouble();
        System.out.println("Inserisci il secondo operatore");
        Scanner input2 = new Scanner(System.in);
        double num2 = input2.nextDouble();

        System.out.println("Inserisci operazione ( | + | - | * | / | % | ^ | )");
        Scanner inputOper = new Scanner(System.in);
        String operation = inputOper.next();

        switch (operation) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + somma(num1, num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + sottrazione(num1, num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + moltiplicazione(num1, num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + divisione(num1, num2));
                break;
            case "%":
                divizioneColResto(num1, num2);
                break;
            case "^":
                System.out.println(num1 + " ^ " + num2 + " = " + potenza(num1, num2));
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

    public static double moltiplicazione(double num1, double num2) {
        return num1 * num2;
    }

    public static double potenza(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static double divisione(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Impossibile dividere per zero");
            return Double.NaN;
        }
    }

    public static void divizioneColResto(double num1, double num2) {
        if (num2 != 0) {
            double quoziente = num1 / num2;
            double resto = num1 % num2;
            System.out.println("Quoziente: " + quoziente);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("Divisione per zero!");

        }
    }
}
