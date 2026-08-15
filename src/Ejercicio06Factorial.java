import java.util.Scanner;

public class Ejercicio06Factorial {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Número entre 0 y 20: ");
            int numero = entrada.nextInt();
            if (numero < 0 || numero > 20) throw new IllegalArgumentException("Número fuera de rango");
            long factorial = 1;
            for (int i = 2; i <= numero; i++) factorial *= i;
            System.out.println(numero + "! = " + factorial);
        }
    }
}
