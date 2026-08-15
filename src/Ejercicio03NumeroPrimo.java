import java.util.Scanner;

public class Ejercicio03NumeroPrimo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Número entero: ");
            int numero = entrada.nextInt();
            boolean primo = numero >= 2;
            for (int divisor = 2; divisor * divisor <= numero && primo; divisor++) {
                primo = numero % divisor != 0;
            }
            System.out.println(numero + (primo ? " es primo." : " no es primo."));
        }
    }
}
