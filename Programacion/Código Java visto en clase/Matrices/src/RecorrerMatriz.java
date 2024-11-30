public class RecorrerMatriz {
    public static void main(String[] args) {
        // Recorrer matriz

        final var celdas = 2; //final var = constante donde se va a guardar las celdas
        final var columnas = 3; // final var = constante donde se va a guardar las columnas

        var matriz = new int[celdas][columnas]; // es lo mismo que hacer int[][] matriz = new int[2][3]
        // Añadimos valores a la matriz
        matriz[0][0] = 100; // Primera fila y primera columna
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
       // Recorrer una matriz

        // 1. Ciclo mas externo, recorrer las celdas
       for (var cel = 0; cel < celdas; cel++) {
            //2. Ciclo interno. Recorrer las columnas
           for(var col = 0; col < columnas; col++){
               System.out.println("Valor[" + cel + "][" + col + "] = " + matriz[cel][col]);
           }
       }

    }
}
