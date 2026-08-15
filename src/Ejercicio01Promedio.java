import java.util.Scanner;

public class Ejercicio01Promedio {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Cantidad de calificaciones: ");
            int cantidad = entrada.nextInt();
            double suma = 0;
            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Calificación " + i + ": ");
                suma += entrada.nextDouble();
            }
            System.out.printf("Promedio: %.2f%n", cantidad > 0 ? suma / cantidad : 0);
        }
    }
}
