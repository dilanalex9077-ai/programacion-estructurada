import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Multiplica cada elemento del vector A por el elemento opuesto del vector B.
 */
public class Ejercicio5MultiplicarVectores {

    private static final int VALOR_MINIMO = 1;
    private static final int VALOR_MAXIMO = 20;

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int cantidad = leerCantidad(entrada);
            Random aleatorio = new Random();

            int[] vectorA = crearVectorAleatorio(cantidad, aleatorio);
            int[] vectorB = crearVectorAleatorio(cantidad, aleatorio);
            int[] vectorC = multiplicarEnOrdenInverso(vectorA, vectorB);

            System.out.println("Vector A: " + Arrays.toString(vectorA));
            System.out.println("Vector B: " + Arrays.toString(vectorB));
            System.out.println("Vector C: " + Arrays.toString(vectorC));
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

    private static int[] crearVectorAleatorio(int cantidad, Random aleatorio) {
        int[] vector = new int[cantidad];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(VALOR_MAXIMO - VALOR_MINIMO + 1) + VALOR_MINIMO;
        }
        return vector;
    }

    private static int[] multiplicarEnOrdenInverso(int[] vectorA, int[] vectorB) {
        int[] vectorC = new int[vectorA.length];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] * vectorB[vectorB.length - 1 - i];
        }
        return vectorC;
    }
}
