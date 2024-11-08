public class Recursividad {
    public static void main(String[] args) {
        // Ejercicio 1 FACTORIAL
        System.out.println(factorialNumero(5));

        // Ejercicio 2: Suma de números hasta N
        System.out.println(sumaNumeros(10));

        // Ejercicio 3: Conteo regresivo
        /*NO SE USA EL SOUT PORQUE NO DEVUELVE DATOS, SOLO IMPRIME NUMEROS*/
        cuentaRegresiva(10);

        // Ejercicio 4: Calcular la potencia de un número
        System.out.println(potencia(2,5));

        // Ejercicio 5: Serie de Fibonacci
        System.out.println(fibonacci(5));
    }
    public static int factorialNumero(int n){
        // Formula factorial -> N X (N-1)
        if (n <= 1){
            return 1;
        }
        // Paso recursivo: n * factorial de (n-1)
        return n * factorialNumero(n - 1);
    }
    public static int sumaNumeros(int n){
        // Caso base
        if (n <= 0){
            return 0;
        }
        return n + sumaNumeros(n - 1);
    }
    //La razón por la cual la función countdown se declara como void es porque su objetivo principal
    // es realizar una acción (imprimir los números) y no devolver un valor.
    public static void cuentaRegresiva(int n){
        // Caso base
        if (n <= 0){
            return;
        }
        System.out.println(n);
        // Paso recursivo: llama a countdown con n-1
        cuentaRegresiva(n - 1);
    }
    public static int potencia(int x, int n) {
        // Caso base: cualquier número elevado a la potencia 0 es 1
        if (n == 0) {
            return 1;
        }
        // Caso recursivo: x^n = x * x^(n-1)
        return x * potencia(x, n - 1);
    }
    public static int fibonacci(int f){
        // Caso base:
        if (f == 0){
            return 0;
        }
        if (f == 1){
            return 1;
        }
        // Caso recursivo F(n)=F(n−1)+F(n−2)
        return fibonacci(f - 1) + fibonacci(f - 2);
    }
}
