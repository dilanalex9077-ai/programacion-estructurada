package ciclos;

public final class EjerciciosDoWhile {
    private EjerciciosDoWhile() {}

    public static double totalConDescuentos(double[] importes, char[] colores) {
        int i = 0; double total = 0;
        if (importes.length == 0) return 0;
        do { char color = Character.toUpperCase(colores[i]); double descuento = color == 'R' ? .40 : color == 'A' ? .25 : 0; total += importes[i] * (1 - descuento); i++; } while (i < importes.length);
        return total;
    }

    public static double totalSupermercado(double[] precios, int[] cantidades) {
        int i = 0; double total = 0;
        if (precios.length == 0) return 0;
        do { total += precios[i] * cantidades[i]; i++; } while (i < precios.length);
        return total;
    }

    public static double[] descuentosTeatro(int[] edades, double precio) {
        double[] categorias = new double[5]; int i = 0;
        if (edades.length == 0) return categorias;
        do { int e = edades[i++]; int c = e <= 14 ? 0 : e <= 19 ? 1 : e <= 45 ? 2 : e <= 65 ? 3 : 4; double d = c == 2 ? .10 : (c == 1 || c == 3 ? .25 : .35); if (e >= 5) categorias[c] += precio * d; } while (i < edades.length);
        return categorias;
    }
}
