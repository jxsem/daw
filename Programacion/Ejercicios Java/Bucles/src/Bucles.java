import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        //Imprimir los números del 1 al 100

        for (int i = 1; i <= 100; i++){ // i = i + 1
            System.out.println("Iteración: " + i); // No itera. Simplemente concatena.Si no usas + i, solo verías el texto "Iteración: " sin saber cuál es el valor de i.
        }
        // Contador de vocales en una frase
        String frase = "Hola, ¿cómo estás?";
        int contadorVocales = 0;
        // Cambiar 'inicio' a 'i' como variable de bucle
        for (int i = 0; i < frase.length(); i++) {

            char caracter = frase.charAt(i);
            // Verifica si el carácter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                    caracter == 'o' || caracter == 'u' ||
                    caracter == 'A' || caracter == 'E' || caracter == 'I' ||
                    caracter == 'O' || caracter == 'U') {
                contadorVocales++;
            }
        }
        System.out.println("Total de vocales: " + contadorVocales); // Agrega la impresión del resultado

        // Tabla de multiplicar
        Scanner dato = new Scanner(System.in);
        System.out.println("¿Que tabla de multiplicar deseas: ");

        int tabla = dato.nextByte();

        for (int i = 1; i <= 10; i++){
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }

        //Sumar Números Pares

        /*Descripción: Escribe un programa que le pida al usuario un número entero positivo N
        y luego use un bucle para sumar todos los números pares desde 1 hasta N.
        Al final, imprime el resultado de la suma.*/

        System.out.println("Introduce un numero entero positivo: ");
        int numeroPositivo = dato.nextInt();
        System.out.println("Introduce otro numero entero positivo: ");
        int numeroPositivo2 = dato.nextInt();

        if (numeroPositivo > numeroPositivo2){
            System.out.println("El primer numero debe ser mayor que el segundo para realizar la suma");
        } else{
            int suma = 0; // Variable para sumar, Esta variable se usará para acumular el total de los números pares.

            for (int i = numeroPositivo; i <= numeroPositivo2; i++){ // continúa hasta que i sea mayor que numeroPositivo2 (el for se usa cuando sabemos el numero de iteraciones.)
                if (i % 2 == 0){
                    suma += i;  // Dentro del bucle, se verifica si i es par usando la expresión i % 2 == 0.
                                //Si i es par, se suma a suma usando suma += i;, que es lo mismo que suma = suma + i;
                }
            }
            System.out.println("La suma de todos los números pares desde " + numeroPositivo + " hasta " + numeroPositivo2 + " es: " + suma);
        }

        // Ejercicio: Contar Dígitos en un Número
        //Descripción: Escribe un programa que le pida al usuario que ingrese un número entero positivo
        // y luego cuente cuántos dígitos tiene ese número. Al final, imprime el resultado.

        System.out.println("Introduce un numero entero positivo: ");
        int numero = dato.nextInt();

        // Asegurarse de que el número sea positivo
        if (numero < 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
        } else {
            int contador = 0; // Inicializa un contador de dígitos

            // Usar un bucle para contar los dígitos
            while (numero > 0) {
                numero /= 10; // Divide el número por 10 (recorre la coma y hace que "elimine un numero")
                contador++; // Aumenta el contador por cada dígito (Mientras que la coma tenga valor, seguria aumentando el contador hasta que llegue a 0,)
            }

            // Imprimir el resultado
            System.out.println("El número tiene " + contador + " dígitos.");
        }

        // Ejercicio: Encontrar Números Primos
        //Descripción: Escribe un programa que le pida al usuario un número entero positivo y
        // luego imprima todos los números primos desde 1 hasta ese número.

        System.out.print("Introduce un número entero positivo: ");
        int numeroPrimo = dato.nextInt();

        // Validación del número ingresado
        if (numeroPrimo <= 0) {
            System.out.println("El número es incorrecto, debe ser mayor que cero.");
        } else {
            System.out.println("Los números primos desde 1 hasta " + numeroPrimo + " son: ");

            // Iterar desde 2 hasta numeroPrimo
            for (int i = 2; i <= numeroPrimo; i++) { // Empezamos desde 2 porque es el primer número primo
                boolean esPrimo = true; // Asumimos que i es primo

                // Verificar si i es primo
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) { // Si j divide i sin resto, no es primo
                        esPrimo = false; // No es primo
                        break; // Salimos del bucle
                    }
                }
                // Si es primo, lo imprimimos
                if (esPrimo) {
                    System.out.print(i + " ");
                }
            }
        }
        dato.close(); // Cerrar el scanner
    }
}
