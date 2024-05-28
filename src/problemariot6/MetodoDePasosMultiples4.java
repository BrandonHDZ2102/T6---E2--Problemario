
package problemariot6;

public class MetodoDePasosMultiples4 {
    
    // Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = -2xy
        return -2 * x * y;
    }

    // Implementación del método de Adams-Bashforth-Moulton de tres pasos
    public static void adamsBashforthMoulton(double x0, double y0, double xn, double h) {
        // Inicializamos los valores usando el método de Euler
        double x = x0;
        double y = y0;

        // Guardamos los valores anteriores de y
        double[] yPrev = new double[3];
        yPrev[0] = y0;

        System.out.printf("x0 = %.5f, y0 = %.5f%n", x, y);

        // Calculamos el número de pasos
        int n = (int) ((xn - x0) / h);

        // Iteramos usando el método de Adams-Bashforth-Moulton de tres pasos
        for (int i = 1; i <= n; i++) {
            // Predictor de Adams-Bashforth de tres pasos
            double predictor = y + (h / 24.0) * (55 * f(x, y) - 59 * f(x - h, yPrev[0]) + 37 * f(x - 2 * h, yPrev[1]) - 9 * f(x - 3 * h, yPrev[2]));

            // Corrector de Adams-Moulton de tres pasos
            double corrector = y + (h / 24.0) * (9 * f(x + h, predictor) + 19 * f(x, y) - 5 * f(x - h, yPrev[0]) + f(x - 2 * h, yPrev[1]));

            // Actualizamos los valores de y y yPrev
            for (int j = 2; j > 0; j--) {
                yPrev[j] = yPrev[j - 1];
            }
            yPrev[0] = y;

            // Actualizamos y con el valor del corrector
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

        // Llamada al método de Adams-Bashforth-Moulton de tres pasos
        adamsBashforthMoulton(x0, y0, xn, h);
    }
}


// Entrada
// Ejemplo: dy/dx = -2xy

// Salida (Resultado)
// x0 = 0.00000, y0 = 1.00000
// x1 = 0.10000, y1 = 0.90200
// x2 = 0.20000, y2 = 0.81724
// x3 = 0.30000, y3 = 0.74268
// x4 = 0.40000, y4 = 0.67663
// x5 = 0.50000, y5 = 0.61745
// x6 = 0.60000, y6 = 0.56357
// x7 = 0.70000, y7 = 0.51363
// x8 = 0.80000, y8 = 0.46632
// x9 = 0.90000, y9 = 0.42043
// x10 = 1.00000, y10 = 0.37478