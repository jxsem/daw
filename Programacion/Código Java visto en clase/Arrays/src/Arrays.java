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


        // DECLARAR E INICIAL (o mejor dicho automaticamente)
        int[] Listanumeros = {50, 60, 70, 80, 90};

        // Recorrer e imprimir
        for (int numero : numeros) { // numero ->  Es una variable temporal que se declara dentro del bucle. Su función es almacenar, uno por uno, cada valor del array numeros mientras el bucle itera.
            System.out.println(numero);
        }



        
        /*¿Por qué no sería int i : numeros?
        Porque i como índice no tendría sentido aquí. El for-each no trabaja con índices; en su lugar,
        extrae directamente los valores del array y los asigna a la variable declarada (en este caso, numero).*/

        // En general:
        //
        //Usa manual cuando tienes datos estáticos que no cambian.
        //Usa automática cuando los datos son dinámicos o generados en el programa.
    }

}
