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

    public static double sottrazione(double num1, double num2) {
        return num1 - num2;
    }
}
