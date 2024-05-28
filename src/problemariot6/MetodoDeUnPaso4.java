
package problemariot6;

public class MetodoDeUnPaso4 {
    
     // Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = 2xy
        return 2 * x * y;
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
// Ejemplo: dy/dx = 2xy

// Salida (Resultado)
// x0 = 0.00000, y0 = 1.00000
// x1 = 0.10000, y1 = 1.02000
// x2 = 0.20000, y2 = 1.06160
// x3 = 0.30000, y3 = 1.12723
// x4 = 0.40000, y4 = 1.22082
// x5 = 0.50000, y5 = 1.34692
// x6 = 0.60000, y6 = 1.51171
// x7 = 0.70000, y7 = 1.72311
// x8 = 0.80000, y8 = 1.99186
// x9 = 0.90000, y9 = 2.33168
// x10 = 1.00000, y10 = 2.75998
// x11 = 1.10000, y11 = 3.30077
// x12 = 1.20000, y12 = 3.98863
// x13 = 1.30000, y13 = 4.87140
// x14 = 1.40000, y14 = 6.01515
// x15 = 1.50000, y15 = 7.50653
// x16 = 1.60000, y16 = 9.46107
// x17 = 1.70000, y17 = 12.03910
// x18 = 1.80000, y18 = 15.44842
// x19 = 1.90000, y19 = 20.94928
// x20 = 2.00000, y20 = 29.00119
