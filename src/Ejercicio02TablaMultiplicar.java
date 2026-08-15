import java.util.Scanner;

public class Ejercicio02TablaMultiplicar {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Número: ");
            int numero = entrada.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", numero, i, numero * i);
            }
        }
    }
}
