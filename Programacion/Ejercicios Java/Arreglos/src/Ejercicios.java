public class Ejercicios {
    public static void main(String[] args) {
        //Ejercicio 1: Crear un array simple y recorrerlos con un bucle for.

        // Iniciar el array automatico
        int [] numeros = {1, 2, 3, 4, 5};

        // Recorrer arrays con bucle for
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posicion " + i + " numero almacenado: " + numeros[i]);
        }

        //Ejercicio 2: Suma de elementos en un array

        //Iniciar el array
        int [] enteros = {10, 20, 30, 40, 50};

        // Variable para acumular la suma
        int suma = 0;

        // Recorrer arrays con buckle for
        for (int i = 0; i < enteros.length ; i++){
            suma+=enteros[i]; // Sumar el valor de cada elemento al total
        }

        // Imprimir la suma total
        System.out.println("La suma de los elementos es: " + suma);


        // Ejercicio 3: Encontrar el mayor y menor elemento en un array

        //Iniciar el array
        int [] lista = {4, 2, 9, 7, 5};

        // Inicializar las variables max y min con el primer valor del array
        int max = lista[0];
        int min = lista[0];

        // Recorrer el array para encontrar el mayor y menor
        for(int i = 1; i < lista.length; i++){
            if (lista[i] > max) {
                max = lista[i]; // Actualizar max si encontramos un valor mayor
            }
            if (lista[i] < min) {
                min = lista[i]; // Actualizar min si encontramos un valor menor
            }
        }
        // Imprimir el mayor y menor número
        System.out.println("El mayor número es: " + max);
        System.out.println("El menor número es: " + min);
    }
}
