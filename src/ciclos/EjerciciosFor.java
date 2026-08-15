package ciclos;

public final class EjerciciosFor {
    private EjerciciosFor() {}

    public static double promedio(double[] valores) {
        double suma = 0;
        for (double valor : valores) suma += valor;
        return valores.length == 0 ? 0 : suma / valores.length;
    }

    public static double minimo(double[] valores) {
        double minimo = Double.POSITIVE_INFINITY;
        for (double valor : valores) if (valor < minimo) minimo = valor;
        return minimo;
    }

    public static int[] tablaMultiplicar(int numero, int limite) {
        int[] productos = new int[limite];
        for (int i = 1; i <= limite; i++) productos[i - 1] = numero * i;
        return productos;
    }

    public static double[] promedioPesoPorEdad(int[] edades, double[] pesos) {
        double[] sumas = new double[4];
        int[] cantidades = new int[4];
        for (int i = 0; i < edades.length; i++) {
            int grupo = edades[i] <= 12 ? 0 : edades[i] <= 29 ? 1 : edades[i] <= 59 ? 2 : 3;
            sumas[grupo] += pesos[i];
            cantidades[grupo]++;
        }
        for (int i = 0; i < 4; i++) sumas[i] = cantidades[i] == 0 ? 0 : sumas[i] / cantidades[i];
        return sumas;
    }

    public static double ingresoNaranjas(double precioKilo, double[] kilos) {
        double ingreso = 0;
        for (double cantidad : kilos) ingreso += cantidad * precioKilo * (cantidad > 10 ? 0.85 : 1);
        return ingreso;
    }

    public static double[] estadisticasContaminacion(double[] puntos) {
        return new double[]{promedio(puntos), minimo(puntos), maximo(puntos)};
    }

    public static double sumarDiez(double[] valores) {
        double suma = 0;
        for (int i = 0; i < Math.min(10, valores.length); i++) suma += valores[i];
        return suma;
    }

    private static double maximo(double[] valores) {
        double maximo = Double.NEGATIVE_INFINITY;
        for (double valor : valores) if (valor > maximo) maximo = valor;
        return maximo;
    }
}
