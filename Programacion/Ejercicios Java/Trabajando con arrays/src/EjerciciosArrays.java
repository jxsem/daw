package src;

import java.util.Scanner;

public class EjerciciosArrays {
    public static void main(String[] args) {
        // 1. Calcular la Suma y el Promedio de un Array
        Scanner dato = new Scanner(System.in);

            // Paso 1: Solicitar el tamaño del array
            System.out.print("Introduce el tamaño del array: ");
            int n = dato.nextInt();

            int [] numeros = new int[n]; // realizamos el array manual, ya que va a introducir el usuario datos
            int suma = 0; // inicializamos la variable fuera del for

            // Paso 2: Llenar el array con valores ingresados por el usuario
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Introduce un número para la posición " + i + ": ");
                numeros[i] = dato.nextInt();
                suma += numeros[i]; // Sumar los valores
            }

            // Paso 3: Calcular el promedio
            double promedio = (double) suma / numeros.length;

            // Paso 4: Mostrar resultados
            System.out.println("Suma de los elementos: " + suma);
            System.out.println("Promedio de los elementos: " + promedio);

        /*2. Buscar Elementos en un Array
        Objetivo: Implementar búsqueda lineal y binaria en arrays.*/

        System.out.print("Introduce un número para buscar: ");
        int buscado = dato.nextInt();

        boolean encontrado = false; // Se declara e inicializa la variable encontrado como false. Esto indica que, inicialmente, no se ha encontrado el número buscado.

        // Búsqueda lineal
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                System.out.println("Número encontrado en la posición " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El número no está en el array.");
        }
        /*Resumen:
        El else dentro del for no es adecuado porque ejecutará un mensaje "por iteración".
        Usar un if después del for es más claro y asegura que el mensaje
        "El número no está en el array" solo se imprima después de revisar todos los elementos.*/

        /*2.2. Búsqueda Binaria (en arrays ordenados)*/
        System.out.print("Introduce un número para buscar: ");
        int encontrar = dato.nextInt();

        int inicio = 0;
        int fin = numeros.length - 1;
        boolean busqueda = false;

        // Búsqueda binaria
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (numeros[medio] == buscado) {
                System.out.println("Número encontrado en la posición " + medio);
                busqueda = true;
                break;
            } else if (numeros[medio] < buscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        if (!encontrado) {
            System.out.println("El número no está en el array.");
        }
    }
}
