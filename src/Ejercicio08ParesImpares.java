import java.util.Scanner;

public class Ejercicio08ParesImpares {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Cantidad de números: ");
            int cantidad = entrada.nextInt(), pares = 0;
            for (int i = 0; i < cantidad; i++) if (entrada.nextInt() % 2 == 0) pares++;
            System.out.printf("Pares: %d%nImpares: %d%n", pares, cantidad - pares);
        }
    }
}
