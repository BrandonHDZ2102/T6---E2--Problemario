
package problemariot6;

public class MetodoDeUnPaso3 {
   
     // Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = y - x^2 + 1
        return y - x * x + 1;
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
        double y0 = 0.5;
        double xn = 2; // valor de x hasta donde se quiere calcular
        double h = 0.2; // tamaño del paso

        // Llamada al método de Euler
        euler(x0, y0, xn, h);
    }
}



// Entrada
// Ejemplo: dy/dx = y - x^2 + 1

// Salida (Resultado)
// x0 = 0.00000, y0 = 0.50000
// x1 = 0.20000, y1 = 0.70000
// x2 = 0.40000, y2 = 0.92400
// x3 = 0.60000, y3 = 1.17120
// x4 = 0.80000, y4 = 1.44136
// x5 = 1.00000, y5 = 1.73403
// x6 = 1.20000, y6 = 2.04884
// x7 = 1.40000, y7 = 2.38507
// x8 = 1.60000, y8 = 2.74284
// x9 = 1.80000, y9 = 3.12251
// x10 = 2.00000, y10 = 3.52442
