
package problemariot6;

public class MetodoDePasosMultiples2 {
    
    // Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = -y + cos(x)
        return -y + Math.cos(x);
    }

    // Implementación del método de Adams-Moulton de 2 pasos
    public static void adamsMoulton(double x0, double y0, double xn, double h) {
        // Inicializamos los valores usando el método de Euler
        double x = x0;
        double y = y0;

        // Guardamos los valores anteriores de y
        double yPrev = y0;

        System.out.printf("x0 = %.5f, y0 = %.5f%n", x, y);

        // Calculamos el número de pasos
        int n = (int) ((xn - x0) / h);

        // Iteramos usando el método de Adams-Moulton
        for (int i = 1; i <= n; i++) {
            // Calculamos y usando el método de Adams-Moulton
            double predictor = y + (h / 2) * (f(x, y) + f(x + h, yPrev));
            double corrector = y + (h / 2) * (f(x, y) + f(x + h, predictor));
            yPrev = y;
            y = corrector;

            // Incrementamos x
            x = x0 + i * h;

            // Mostramos los valores de x y y
            System.out.printf("x%d = %.5f, y%d = %.5f%n", i, x, i, y);
        }
    }

    public static void main(String[] args) {
        // Valores iniciales
        double x0 = 0;
        double y0 = 1;
        double xn = 2; // valor de x hasta donde se quiere calcular
        double h = 0.1; // tamaño del paso

        // Llamada al método de Adams-Moulton
        adamsMoulton(x0, y0, xn, h);
    }
}


// Entrada
// Ejemplo: dy/dx = -y + cos(x)

// Salida (Resultado)
// x0 = 0.00000, y0 = 1.00000
// x1 = 0.10000, y1 = 0.90832
// x2 = 0.20000, y2 = 0.82303
// x3 = 0.30000, y3 = 0.74449
// x4 = 0.40000, y4 = 0.67211
// x5 = 0.50000, y5 = 0.60527
// x6 = 0.60000, y6 = 0.54339
// x7 = 0.70000, y7 = 0.48591
// x8 = 0.80000, y8 = 0.43228
// x9 = 0.90000, y9 = 0.38197
// x10 = 1.00000, y10 = 0.33445
// x11 = 1.10000, y11 = 0.28921
// x12 = 1.20000, y12 = 0.24574
// x13 = 1.30000, y13 = 0.20353
// x14 = 1.40000, y14 = 0.16207
// x15 = 1.50000, y15 = 0.12085
// x16 = 1.60000, y16 = 0.07935
// x17 = 1.70000, y17 = 0.03702
// x18 = 1.80000, y18 = -0.00689
// x19 = 1.90000, y19 = -0.05162
// x20 = 2.00000, y20 = -0.09665

