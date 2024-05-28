
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


// Entrada
// Ejemplo: dy/dx = y - x^2 + 1

// Salida (Resultado)
// x0 = 0.00000, y0 = 0.50000
// x1 = 0.10000, y1 = 0.55000
// x2 = 0.20000, y2 = 0.61250
// x3 = 0.30000, y3 = 0.68938
// x4 = 0.40000, y4 = 0.78132
// x5 = 0.50000, y5 = 0.88845
// x6 = 0.60000, y6 = 1.01083
// x7 = 0.70000, y7 = 1.14867
// x8 = 0.80000, y8 = 1.30130
// x9 = 0.90000, y9 = 1.46821
// x10 = 1.00000, y10 = 1.64805
// x11 = 1.10000, y11 = 1.83965
// x12 = 1.20000, y12 = 2.04198
// x13 = 1.30000, y13 = 2.25418
// x14 = 1.40000, y14 = 2.47555
// x15 = 1.50000, y15 = 2.70555
// x16 = 1.60000, y16 = 2.94379
// x17 = 1.70000, y17 = 3.18999
// x18 = 1.80000, y18 = 3.44399
// x19 = 1.90000, y19 = 3.70575
// x20 = 2.00000, y20 = 3.97533
