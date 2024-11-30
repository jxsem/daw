import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        // Inicializar manualmente
        numeros[0] = 10; // asigna 10 a la posicion 0
        numeros[1] = 20; // asigna 20 a la posicion 1
        numeros[2] = 30; // asigna 30 a la posicion 2
        numeros[3] = 40; // asigna 40 a la posicion 3
        numeros[4] = 50; // asigna 50 a la posicion 4

        // Imprimir el contenido del array
        for (int i = 0; i < numeros.length; i++) { // se inicia un contador desde la posicion 0, El metodo numeros.length devuelve la longitud del array, asegurando que no se salga del rango.
            System.out.println("Elemento en índice " + i + ": " + numeros[i]);
        }

    }

}
