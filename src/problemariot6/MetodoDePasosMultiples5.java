
package problemariot6;

public class MetodoDePasosMultiples5 {
    
    // Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = sin(x) + y
        return Math.sin(x) + y;
    }

    // Implementación del método de Adams-Bashforth-Moulton de cuatro pasos
    public static void adamsBashforthMoulton(double x0, double y0, double xn, double h) {
        // Inicializamos los valores usando el método de Euler
        double x = x0;
        double y = y0;

        // Guardamos los valores anteriores de y
        double[] yPrev = new double[4];
        yPrev[0] = y0;

        System.out.printf("x0 = %.5f, y0 = %.5f%n", x, y);

        // Calculamos el número de pasos
        int n = (int) ((xn - x0) / h);

        // Iteramos usando el método de Adams-Bashforth-Moulton de cuatro pasos
        for (int i = 1; i <= n; i++) {
            // Predictor de Adams-Bashforth de cuatro pasos
            double predictor = y + (h / 720.0) * (1901 * f(x, y) - 2774 * f(x - h, yPrev[0]) + 2616 * f(x - 2 * h, yPrev[1]) - 1274 * f(x - 3 * h, yPrev[2]) + 251 * f(x - 4 * h, yPrev[3]));

            // Corrector de Adams-Moulton de cuatro pasos
            double corrector = y + (h / 720.0) * (251 * f(x + h, predictor) + 646 * f(x, y) - 264 * f(x - h, yPrev[0]) + 106 * f(x - 2 * h, yPrev[1]) - 19 * f(x - 3 * h, yPrev[2]));

            // Actualizamos los valores de y y yPrev
            for (int j = 3; j > 0; j--) {
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
        double y0 = 0;
        double xn = 2 * Math.PI; // valor de x hasta donde se quiere calcular
        double h = 0.1; // tamaño del paso

        // Llamada al método de Adams-Bashforth-Moulton de cuatro pasos
        adamsBashforthMoulton(x0, y0, xn, h);
    }
}

// Entrada
// Ejemplo: dy/dt = y - t^2 + 1

// Salida (Resultado)
// t = 0.0, y = 0.5
// t = 0.1, y = 0.65
// t = 0.2, y (predictor) = 0.8210000000000001, y (corrector) = 0.8210500000000001
// t = 0.30000000000000004, y (predictor) = 1.0062075, y (corrector) = 1.0059128750000002
// t = 0.4, y (predictor) = 1.20424730625, y (corrector) = 1.2039208840625002
// t = 0.5, y (predictor) = 1.4147133729218753, y (corrector) = 1.414352596911719
// t = 0.6, y (predictor) = 1.6368094422453519, y (corrector) = 1.6364106988695726
// t = 0.7, y (predictor) = 1.8696546738544226, y (corrector) = 1.8692139675057724
// t = 0.7999999999999999, y (predictor) = 2.1122755276881597, y (corrector) = 2.111788442265469
// t = 0.8999999999999999, y (predictor) = 2.3635960102300007, y (corrector) = 2.3630576648902424
// t = 0.9999999999999999, y (predictor) = 2.6224268925105054, y (corrector) = 2.6218318927602797
