import java.util.Scanner;

public class Ejercicio07MayorYMenor {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Cantidad de números: ");
            int cantidad = entrada.nextInt();
            int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
            for (int i = 0; i < cantidad; i++) {
                int numero = entrada.nextInt();
                mayor = Math.max(mayor, numero);
                menor = Math.min(menor, numero);
            }
            System.out.printf("Mayor: %d%nMenor: %d%n", mayor, menor);
        }
    }
}
