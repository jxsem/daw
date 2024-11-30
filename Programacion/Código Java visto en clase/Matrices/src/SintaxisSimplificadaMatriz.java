public class SintaxisSimplificadaMatriz {
    public static void main(String[] args) {
        // Definimos una matriz
        var matriz = new int [][]{
                {100, 200, 300,}, //Primera fila
                {400, 500, 600} // Segunda fila
        };

        for(var fila = 0; fila < matriz.length; fila++){
            for(var col = 0; col < matriz[fila].length; col++){ //  devuelve el número de elementos en la fila
                System.out.println("Valor[" + fila + "][" + col + "] = " + matriz[fila][col]);
            }
        }
    }
}
