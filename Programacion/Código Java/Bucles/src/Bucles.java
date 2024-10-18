public class Bucles {
    public static void main(String[] args) {

        // for (inicialización; condición; actualización) {
        //    // Código a ejecutar
        //}
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
            // Ejemplo de break
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // Termina el bucle cuando i es 5
            }
            System.out.println(i);
        }
        // Ejemplo Continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;  // Salta cuando i es 2
            }
            System.out.println(i);
        }

        //while (condición) {
            // Código a ejecutar
        int i = 0;
        while (i < 5) {
            System.out.println("Iteración: " + i);
            i++;  // No olvides incrementar la variable de control
        }

        // El bucle do-while es similar al while, pero la diferencia es que el bloque de código se ejecuta al menos una vez,
        // ya que la condición se evalúa después de cada iteración.

        //do {
            // Código a ejecutar
        //while (condición);
            int contador = 0;
            while (contador < 5) {
                System.out.println("Iteración: " + i);
                contador++;  // No olvides incrementar la variable de control
            }


        /*RESUMEN
        * for: Para iteraciones controladas por un contador.
          while: Para iteraciones controladas por una condición.
          do-while: Ejecuta al menos una vez, y luego evalúa la condición.
          for-each: Para iterar sobre colecciones de manera sencilla.*/
    }
}
