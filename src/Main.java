import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("CA:_CU:_ATOR 0.1 ");

        System.out.println("Inserisci la prima operanda");
        Scanner input1 = new Scanner(System.in);

        int num1 = input1.nextInt();
        System.out.println("Inserisci la seconda operanda");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        System.out.println("Inserisci operazione ( + | - | * | / | % | ^ |)");
        Scanner inputOper = new Scanner(System.in);
        String operation = inputOper.next();

        recognitionAndCalculation(operation, num1, num2);


    }
    public static void recognitionAndCalculation(String operation, int num1, int num2) {
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
                System.out.println(num1 + "/" + num2 + "=" + (double) divizione(num1, num2));
            case "%":
                System.out.println(num1 + "%" + num2 + "=" + (double) divizioneColResto(num1, num2));
                break;
            case "^":
                System.out.println(num1 + "^" + num2 + "=" + (double) potenza(num1, num2));
                break;
            default:
                System.out.println("Input error");
                break;
        }

    }
}
