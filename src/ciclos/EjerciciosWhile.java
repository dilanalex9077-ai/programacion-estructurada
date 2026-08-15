package ciclos;

public final class EjerciciosWhile {
    private EjerciciosWhile() {}

    public static double pagoVendedor(double sueldoBase, double[] ventas) {
        int i = 0; double totalVentas = 0;
        while (i < ventas.length) totalVentas += ventas[i++];
        return sueldoBase + totalVentas * 0.10;
    }

    public static double salarioSemanal(int horas) {
        return horas <= 40 ? horas * 20.0 : 800 + (horas - 40) * 25.0;
    }

    public static int[] contarGeneros(char[] generos) {
        int h = 0, m = 0, i = 0;
        while (i < generos.length) { if (Character.toUpperCase(generos[i]) == 'H') h++; else m++; i++; }
        return new int[]{h, m};
    }

    public static int[] contarCalcomanias(int[] digitos) {
        int[] colores = new int[5]; int i = 0;
        while (i < digitos.length) { int d = digitos[i++]; colores[d <= 2 ? 0 : d <= 4 ? 1 : d <= 6 ? 2 : d <= 8 ? 3 : 4]++; }
        return colores;
    }

    public static double promedio(double[] valores) {
        int i = 0; double suma = 0;
        while (i < valores.length) suma += valores[i++];
        return valores.length == 0 ? 0 : suma / valores.length;
    }

    public static double[] promedioEdades(int[] edades, char[] generos) {
        int i = 0, h = 0, m = 0; double sumaH = 0, sumaM = 0;
        while (i < edades.length) { if (Character.toUpperCase(generos[i]) == 'H') { sumaH += edades[i]; h++; } else { sumaM += edades[i]; m++; } i++; }
        return new double[]{h == 0 ? 0 : sumaH / h, m == 0 ? 0 : sumaM / m, promedio(java.util.Arrays.stream(edades).asDoubleStream().toArray())};
    }

    public static double menor(double[] valores) { int i = 0; double menor = Double.POSITIVE_INFINITY; while (i < valores.length) menor = Math.min(menor, valores[i++]); return menor; }
    public static double mayor(double[] valores) { int i = 0; double mayor = Double.NEGATIVE_INFINITY; while (i < valores.length) mayor = Math.max(mayor, valores[i++]); return mayor; }
}
