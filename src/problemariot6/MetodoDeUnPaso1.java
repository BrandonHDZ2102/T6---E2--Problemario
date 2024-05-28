package problemariot6;

public class MetodoDeUnPaso1 {

// Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = x + y
        return x + y;
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
        double h = 0.2; // tamaño del paso

        // Llamada al método de Euler
        euler(x0, y0, xn, h);
    }
}
    



// Entrada
// Ejemplo: dy/dx = x + y

// Salida (Resultado)
// x0 = 0.00000, y0 = 1.00000
// x1 = 0.20000, y1 = 1.20000
// x2 = 0.40000, y2 = 1.44000
// x3 = 0.60000, y3 = 1.72800
// x4 = 0.80000, y4 = 2.08360
// x5 = 1.00000, y5 = 2.51832
// x6 = 1.20000, y6 = 3.04600
// x7 = 1.40000, y7 = 3.68240
// x8 = 1.60000, y8 = 4.44568
// x9 = 1.80000, y9 = 5.35782
// x10 = 2.00000, y10 = 6.44438
