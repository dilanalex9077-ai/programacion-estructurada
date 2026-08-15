import java.util.Scanner;

public class Ejercicio09Palindromo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Texto: ");
            String texto = entrada.nextLine().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            String inverso = new StringBuilder(texto).reverse().toString();
            System.out.println(texto.equals(inverso) ? "Es palíndromo." : "No es palíndromo.");
        }
    }
}
