import java.util.Scanner;

public class Ejercicio11Fibonacci {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Cantidad de términos: ");
            int cantidad = entrada.nextInt();
            long anterior = 0, actual = 1;
            for (int i = 0; i < cantidad; i++) {
                System.out.print(anterior + (i + 1 == cantidad ? "\n" : " "));
                long siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;
            }
        }
    }
}
