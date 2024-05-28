
package problemariot6;

public class MetodoDePasosMultiples3 {
    
    // Definimos la función f(x, y) = dy/dx
    public static double f(double x, double y) {
        // Ejemplo: dy/dx = y - x^2 + 1
        return y - x * x + 1;
    }

    // Implementación del método de Adams-Bashforth-Moulton de 2 pasos
    public static void adamsBashforthMoulton(double x0, double y0, double xn, double h) {
        // Inicializamos los valores usando el método de Euler
        double x = x0;
        double y = y0;

        // Guardamos los valores anteriores de y
        double yPrev = y0;

        System.out.printf("x0 = %.5f, y0 = %.5f%n", x, y);

        // Calculamos el número de pasos
        int n = (int) ((xn - x0) / h);

        // Iteramos usando el método de Adams-Bashforth-Moulton
        for (int i = 1; i <= n; i++) {
            // Predictor de Adams-Bashforth
            double predictor = y + (h / 2) * (3 * f(x, y) - f(x - h, yPrev));
            
            // Corrector de Adams-Moulton
            double corrector = y + (h / 2) * (f(x, y) + f(x + h, predictor));
            
            // Actualizamos los valores de y y yPrev
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
        double y0 = 0.5;
        double xn = 2; // valor de x hasta donde se quiere calcular
        double h = 0.1; // tamaño del paso

        // Llamada al método de Adams-Bashforth-Moulton
        adamsBashforthMoulton(x0, y0, xn, h);
    }
}
