public class Recursividad {
    public static void main(String[] args) {
        /*Recursividad -> técnica en la que un metodo se llama  así mismo para resolver un problema
         * cada vez que un metodo recursivo se llama a si mismo, reduce el problema original en subproblemas mas pequeños
         * hasta alcanzar un caso base que termina la recursion*/

        /*Tiene dos partes:

         * CASO BASE -> CONDICION QUE DETIENE LA RECURSION
         * CASO RECURSIVO -> CASO EN EL QUE EL METODO SE LLAMA  A SI MISMO CON UN PROBLEMA REDUCIDO*/
        int result = fibonacci(6);
        System.out.println("El sexto numero de Fibonacci es: " + result);
    }
    public static int fibonacci(int n){
        // Caso base: si n es 0 o 1, retorna (Pararia la funcion)
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }
        // Caso recursivo: fibonacci (n - 1) + fibonacci (n - 2) (Hace la secuencia hasta llegar al caso base, se llama a la funcion aqui mismo)
        return fibonacci (n - 1) + fibonacci (n - 2);
    }

    // ¿CUANDO USAR LA RECURSIVIDAD?
    /*Cuando el problema se puede dividir en pasos similares*/
    /*Cuando tienes una estructura tipo Arbol -> Ramas, ramas, ramas, y mas ramas, y mas y mas y maaaaaassss!!!*/
    /*Cuando es mas facil de entender*/

    // ¿CUANDO NO USARLA?
    /*Cuando el problema es facil de realizar */
    /*Cuando usar recursividad empeoraria el caso*/
    /*Cuando podria causar errores*/
    /*Cuando no quieres usar mucha memoria*/
}
