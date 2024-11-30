public class RecorrerArray {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        // Inicializar manualmente
        numeros[0] = 10; // asigna 10 a la posicion 0
        numeros[1] = 20; // asigna 20 a la posicion 1
        numeros[2] = 30; // asigna 30 a la posicion 2
        numeros[3] = 40; // asigna 40 a la posicion 3
        numeros[4] = 50; // asigna 50 a la posicion 4

        // Recorrer e imprimir
        for (int numero : numeros) { // numero ->  Es una variable temporal que se declara dentro del bucle. Su función es almacenar, uno por uno, cada valor del array numeros mientras el bucle itera.
            System.out.println(numero);
        }
    }
}
