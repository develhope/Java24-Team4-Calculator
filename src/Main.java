public class Main {

    public static void main(String[] args) {
        System.out.println("INIT");
    }

    public static void divizione(double num1, double num2) {
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