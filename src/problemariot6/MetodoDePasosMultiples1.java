
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
