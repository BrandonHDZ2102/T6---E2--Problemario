# T6 --  E2  --     Problemario

### Integrantes:

- Brandon Hernández Espinosa
- Italia Yoselin Lozada Olvera

  ## Método de un paso:
### Descripción 

En métodos numéricos, cuando hablamos del "método de un paso", nos referimos a esos trucos donde solo echamos mano de un dato anterior para calcular el siguiente en la solución de un problema. Son de lo más útiles, sobre todo para resolver ecuaciones diferenciales ordinarias (EDO).


### Implementación: 
- Implementación en C#

```
using System;

class EulerMethod
{
    // Función que representa la EDO dy/dx = f(x, y)
    static double Func(double x, double y)
    {
        // Ejemplo: dy/dx = x + y
        return x + y;
    }

    static void Main()
    {
        // Valores iniciales
        double x0 = 0;  // valor inicial de x
        double y0 = 1;  // valor inicial de y
        double h = 0.01;  // tamaño del paso
        int n = 100;  // número de pasos

        // Método de Euler
        for (int i = 0; i < n; i++)
        {
            double y1 = y0 + h * Func(x0, y0);
            x0 = x0 + h;
            y0 = y1;

            // Mostrar los resultados
            Console.WriteLine("x: {0:F4}, y: {1:F4}", x0, y0);
        }
    }
}



```


### Ejemplos en java:

[Ejemplo 1](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDeUnPaso1.java)

[Ejemplo 2](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDeUnPaso2.java)

[Ejemplo 3](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDeUnPaso3.java)

[Ejemplo 4](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDeUnPaso4.java)

[Ejemplo 5](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDeUnPaso5.java)



--------------------------------------------------------------

## Método de pasos múltiples.
### Descripción: 
El "método de pasos múltiples" es una técnica usada en métodos numéricos para resolver ecuaciones diferenciales ordinarias (EDO). A diferencia de los métodos de un solo paso, que solo usan la información del punto anterior, los métodos de pasos múltiples se basan en varios puntos previos. Esto puede mejorar la precisión y eficiencia del cálculo.
Los métodos de pasos múltiples son herramientas potentes en el análisis numérico para resolver EDOs, ofreciendo un buen equilibrio entre precisión y eficiencia. Sin embargo, usarlos correctamente requiere entender bien cómo funcionan y su estabilidad.



### Implementación: 
- Implementación en C#

```

using System;

class AdamsBashforth
{
    // Función que representa la EDO dy/dx = f(x, y)
    static double Func(double x, double y)
    {
        // Ejemplo: dy/dx = x + y
        return x + y;
    }

    static void Main()
    {
        // Valores iniciales
        double x0 = 0;  // valor inicial de x
        double y0 = 1;  // valor inicial de y
        double h = 0.1;  // tamaño del paso
        int n = 10;  // número de pasos

        // Primer paso utilizando el método de Euler
        double x1 = x0 + h;
        double y1 = y0 + h * Func(x0, y0);

        Console.WriteLine("Paso 0: x = {0:F4}, y = {1:F4}", x0, y0);
        Console.WriteLine("Paso 1: x = {0:F4}, y = {1:F4}", x1, y1);

        // Método de Adams-Bashforth de dos pasos
        for (int i = 2; i <= n; i++)
        {
            double x2 = x1 + h;
            double y2 = y1 + (h / 2) * (3 * Func(x1, y1) - Func(x0, y0));

            // Mostrar los resultados
            Console.WriteLine("Paso {0}: x = {1:F4}, y = {2:F4}", i, x2, y2);

            // Actualizar los valores para el siguiente paso
            x0 = x1;
            y0 = y1;
            x1 = x2;
            y1 = y2;
        }
    }
}



```


### Ejemplos en java:

[Ejemplo 1](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDePasosMultiples1.java)

[Ejemplo 2](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDePasosMultiples2.java)

[Ejemplo 3](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDePasosMultiples3.java)

[Ejemplo 4](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDePasosMultiples4.java)

[Ejemplo 5](https://github.com/BrandonHDZ2102/T6---E2--Problemario/blob/main/src/problemariot6/MetodoDePasosMultiples5.java)
