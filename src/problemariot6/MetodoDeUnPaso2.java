package problemariot6;

public class MetodoDeUnPaso2 {

    // Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = x^2 + y
        return x * x + y;
    }

    // Implementación del método de Euler
    public static void euler(double x0, double y0, double xn, double h) {
        int n = (int) ((xn - x0) / h); // Número de pasos
        double x = x0;
        double y = y0;

        System.out.printf("x0 = %.5f, y0 = %.5f%n", x, y);

        for (int i = 1; i <= n; i++) {
            y = y + h * f(x, y);
            x = x + h;
            System.out.printf("x%d = %.5f, y%d = %.5f%n", i, x, i, y);
        }
    }

    public static void main(String[] args) {
        // Valores iniciales
        double x0 = 0;
        double y0 = 1;
        double xn = 2; // valor de x hasta donde se quiere calcular
        double h = 0.1; // tamaño del paso

        // Llamada al método de Euler
        euler(x0, y0, xn, h);
    }
}


// Entrada
// Ejemplo: dy/dx = x^2 + y

// Salida (Resultado)
// x0 = 0.00000, y0 = 1.00000
// x1 = 0.10000, y1 = 1.01000
// x2 = 0.20000, y2 = 1.04010
// x3 = 0.30000, y3 = 1.09123
// x4 = 0.40000, y4 = 1.16449
// x5 = 0.50000, y5 = 1.26103
// x6 = 0.60000, y6 = 1.38111
// x7 = 0.70000, y7 = 1.52509
// x8 = 0.80000, y8 = 1.69340
// x9 = 0.90000, y9 = 1.88656
// x10 = 1.00000, y10 = 2.10523
// x11 = 1.10000, y11 = 2.35021
// x12 = 1.20000, y12 = 2.62244
// x13 = 1.30000, y13 = 2.92303
// x14 = 1.40000, y14 = 3.25320
// x15 = 1.50000, y15 = 3.61435
// x16 = 1.60000, y16 = 4.00810
// x17 = 1.70000, y17 = 4.43627
// x18 = 1.80000, y18 = 4.90090
// x19 = 1.90000, y19 = 5.40430
// x20 = 2.00000, y20 = 5.94804
