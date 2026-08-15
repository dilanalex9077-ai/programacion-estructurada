import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10OrdenarVector {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Cantidad de elementos: ");
            int[] vector = new int[entrada.nextInt()];
            for (int i = 0; i < vector.length; i++) vector[i] = entrada.nextInt();
            Arrays.sort(vector);
            System.out.println("Ordenado: " + Arrays.toString(vector));
        }
    }
}
