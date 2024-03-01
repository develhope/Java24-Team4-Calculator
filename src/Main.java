import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("INIT");
        Scanner inserisciNumero = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int numero = inserisciNumero.nextInt();

        String tipoNumero = pariDispari(numero);
        System.out.println("Il numero inserito è " + tipoNumero);
    }
    public static String pariDispari(int numero) {
        if (numero % 2 == 0) {
            return "Pari";
        } else {
            return "Dispari";
        }
    }
}