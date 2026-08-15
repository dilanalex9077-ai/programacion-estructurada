import java.util.Arrays;
import java.util.Scanner;

/**
 * Busca un número dentro de un vector e informa su posición.
 */
public class Ejercicio4BuscarNumero {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int cantidad = leerCantidad(entrada);
            int[] vector = leerVector(entrada, cantidad);

            System.out.print("Número que deseas buscar: ");
            int numero = entrada.nextInt();
            int posicion = buscarNumero(vector, numero);

            System.out.println("Vector: " + Arrays.toString(vector));
            if (posicion >= 0) {
                System.out.printf("El número %d se encuentra en la posición %d.%n", numero, posicion);
            } else {
                System.out.println("NO se encontró el número en el vector.");
            }
        }
    }

    private static int leerCantidad(Scanner entrada) {
        int cantidad;
        do {
            System.out.print("Cantidad de elementos (1 a 20): ");
            cantidad = entrada.nextInt();
        } while (cantidad < 1 || cantidad > 20);
        return cantidad;
    }

    private static int[] leerVector(Scanner entrada, int cantidad) {
        int[] vector = new int[cantidad];
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Elemento x[%d]: ", i);
            vector[i] = entrada.nextInt();
        }
        return vector;
    }

    private static int buscarNumero(int[] vector, int numero) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}
