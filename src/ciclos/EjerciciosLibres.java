package ciclos;

import java.util.ArrayList;
import java.util.List;

public final class EjerciciosLibres {
    private EjerciciosLibres() {}

    public static double masaAire(double presion, double volumen, double temperatura) { return presion * volumen / (.37 * (temperatura + 460)); }
    public static double calidadGallina(double peso, double altura, int huevos) { return peso * altura / huevos; }
    public static int sumaParesDescendente() { int s = 0; for (int i = 100; i >= 0; i -= 2) s += i; return s; }
    public static double porcentajeAprobados(double[] notas) { int a = 0; for (double n : notas) if (n >= 70) a++; return notas.length == 0 ? 0 : a * 100.0 / notas.length; }
    public static int sumaSucesion(int cantidad) { int s = 0; for (int i = 0; i < cantidad; i++) s += 20 + i * 5; return s; }
    public static int sumaCuadrados(int cantidad) { int s = 0; for (int i = 1; i <= cantidad; i++) s += i * i; return s; }
    public static int[] mayorMenor(int[] valores) { int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE; for (int n : valores) { mayor = Math.max(mayor, n); menor = Math.min(menor, n); } return new int[]{mayor, menor}; }
    public static int sumaUnoACien() { int s = 0; for (int i = 1; i <= 100; i++) s += i; return s; }
    public static long factorial(int n) { long f = 1; for (int i = 2; i <= n; i++) f *= i; return f; }
    public static List<Integer> impares() { List<Integer> r = new ArrayList<>(); for (int i = 1; i < 100; i += 2) r.add(i); return r; }
    public static long sumaAnteriores(int n) { return (long) n * (n - 1) / 2; }
    public static boolean esPrimo(int n) { if (n < 2) return false; for (int i = 2; i * i <= n; i++) if (n % i == 0) return false; return true; }
    public static int sumaPositivos(int[] valores) { int s = 0; for (int n : valores) if (n >= 0) s += n; return s; }
    public static long multiplicarNegativos(int[] valores) { long p = 1; for (int n : valores) if (n < 0) p *= n; return p; }
    public static double seriePositiva(double x, int n) { double s = 0; for (int i = 1, d = 1; i <= n; i++, d += 2) s += Math.pow(x, 1.0 / i) / d; return s; }
    public static String cuentaRegresiva() { StringBuilder s = new StringBuilder(); for (int i = 1000; i >= 0; i--) s.append(i).append(i == 0 ? "" : " "); return s.toString(); }
}
