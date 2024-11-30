import java.util.List;

public class SintaxisSimplificadaArrays {
    public static void main(String[] args) {
        // DECLARAR E INICIAL (o mejor dicho automaticamente)
        int[] Listanumeros = {50, 60, 70, 80, 90};

        for (int i = 0; i < Listanumeros.length; i++) { // se inicia un contador desde la posicion 0, El metodo numeros.length devuelve la longitud del array, asegurando que no se salga del rango.
            System.out.println("Elemento en índice " + i + ": " + Listanumeros[i]);
        }

        // En general:
        //
        //Usa manual cuando tienes datos estáticos que no cambian.
        //Usa automática cuando los datos son dinámicos o generados en el programa.

    }
}
