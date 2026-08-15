import java.util.Scanner;

public class Ejercicio12DiagonalMatriz {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Tamaño de la matriz cuadrada: ");
            int n = entrada.nextInt(), suma = 0;
            for (int fila = 0; fila < n; fila++) {
                for (int columna = 0; columna < n; columna++) {
                    int valor = entrada.nextInt();
                    if (fila == columna) suma += valor;
                }
            }
            System.out.println("Suma de la diagonal principal: " + suma);
        }
    }
}
