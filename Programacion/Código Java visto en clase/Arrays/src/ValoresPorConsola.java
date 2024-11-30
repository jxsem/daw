import java.util.Scanner;

public class ValoresPorConsola {
    public static void main(String[] args) {

        // Introducir valores por consola
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el largo del arreglo: ");

        // leer un valor desde la consola, convertirlo de tipo String a int y asignarlo a la variable largoArreglo,
        // NO ES NECESARIO YA QUE ESTAMOS SOLO ALMACENANDO NUMEROS

        int largoArreglo = consola.nextInt(); // Entra el largo del array
        var enteros = new int[largoArreglo];// Se guarda el largo del array

        for(var i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = consola.nextInt();
        }

        //Imprimir valores arreglos
        System.out.println("Impresion del arreglo: ");
        for(var i = 0; i < largoArreglo; i++)
            System.out.println("enteros[" + i + "] = " + enteros[i]);
    }
}
