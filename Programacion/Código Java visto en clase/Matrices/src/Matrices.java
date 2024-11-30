public class Matrices {
    public static void main(String[] args) {
        /*Que es una matriz*/
        /*Es un arreglo de dos dimensiones, con filas y columnas -> 0,0 0,1 0,2 1,1 1,2 1,3*/

        //Definimos una matriz
        int[][] matriz = new int[2][3]; // la matriz tendra 2 filas y 3 columnas
        // Modificar los valores de la matriz
        matriz[0][0] = 100; // Primera fila y primera columna
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // ACCEDER VALORES
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 5 [1][2] = " + matriz[1][2]);

        /*Índices:          Columna 0  Columna 1  Columna 2
                    Fila 0   [0,0]      [0,1]      [0,2]
                    Fila 1   [1,0]      [1,1]      [1,2]*/
    }
}
