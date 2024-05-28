
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