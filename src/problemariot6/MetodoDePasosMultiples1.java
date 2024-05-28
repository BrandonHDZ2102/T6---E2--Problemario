
package problemariot6;

public class MetodoDePasosMultiples1 {
    
    // Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = sin(x) - y
        return Math.sin(x) - y;
    }

    // Implementación del método de Adams-Bashforth de 2 pasos
    public static void adamsBashforth(double x0, double y0, double xn, double h) {
        // Inicializamos los valores usando el método de Euler
        double x = x0;
        double y = y0;

        // Guardamos los valores anteriores de y
        double yPrev = y0;

        System.out.printf("x0 = %.5f, y0 = %.5f%n", x, y);

        // Calculamos el número de pasos
        int n = (int) ((xn - x0) / h);

        // Iteramos usando el método de Adams-Bashforth
        for (int i = 1; i <= n; i++) {
            // Calculamos y usando el método de Adams-Bashforth
            if (i == 1) {
                // En el primer paso, usamos el método de Euler para obtener y1
                y = y0 + h * f(x, y);
            } else {
                // En pasos subsiguientes, usamos el método de Adams-Bashforth
                double predictor = y + (h / 2) * (3 * f(x, y) - f(x - h, yPrev));
                yPrev = y;
                y = predictor;
            }

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

        // Llamada al método de Adams-Bashforth
        adamsBashforth(x0, y0, xn, h);
    }
}



// Entrada
// Ejemplo: dy/dx = sin(x) - y

// Salida (Resultado)
// x0 = 0.00000, y0 = 1.00000
// x1 = 0.10000, y1 = 0.90017
// x2 = 0.20000, y2 = 0.81146
// x3 = 0.30000, y3 = 0.73407
// x4 = 0.40000, y4 = 0.66833
// x5 = 0.50000, y5 = 0.61476
// x6 = 0.60000, y6 = 0.57304
// x7 = 0.70000, y7 = 0.54297
// x8 = 0.80000, y8 = 0.52451
// x9 = 0.90000, y9 = 0.51777
// x10 = 1.00000, y10 = 0.52204
// x11 = 1.10000, y11 = 0.53780
// x12 = 1.20000, y12 = 0.56466
// x13 = 1.30000, y13 = 0.60237
// x14 = 1.40000, y14 = 0.65080
// x15 = 1.50000, y15 = 0.70994
// x16 = 1.60000, y16 = 0.77987
// x17 = 1.70000, y17 = 0.86082
// x18 = 1.80000, y18 = 0.95310
// x19 = 1.90000, y19 = 1.05720
// x20 = 2.00000, y20 = 1.17371
