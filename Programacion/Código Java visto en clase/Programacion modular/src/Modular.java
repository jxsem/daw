public class Modular {

    public static void main(String[] args) {
        int resultado = sumar(5, 7); // Pasa los valores 5 y 7
        System.out.println("La suma es: " + resultado);

        // Llamar a la función imprimirSaludo
        imprimirSaludo("Juan");
    }

    // Definición de las funciones, bloque de codigo en el cual hacemos eficiente la programacion.
    public static int sumar(int a, int b) { // static -> En Java, las funciones (o métodos) pueden ser estáticas o no estáticas.
        // La palabra clave static indica que el metodo pertenece a la clase en sí y no a las instancias (objetos) de la clase.
        return a + b;
    }

    public static void imprimirSaludo(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }
}
