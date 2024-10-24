import java.sql.SQLOutput;
import java.util.Scanner; // Importamos la clase scanner para entrada de datos

public class Modulos {
    public static void main(String[] args) { // Este es el punto de entrada de cualquier aplicación Java.
        Scanner dato = new Scanner(System.in);

        System.out.println("Introduce un primer numero: ");
        int num1 = dato.nextInt();

        System.out.println("Introduce un primer numero: ");
        int num2 = dato.nextInt();

        int resultado = sumar(num1, num2); // Llamar a la funcion suma
        System.out.println("El resultado es " + resultado);

        /*Declaramos la variable que tenga el tipo de dato correspondiente y un nombre que queramos al valor que devolvera*/
        /*Usamos asignacion y a continuacion llamamos a la funcion, en este caso se llama sumar y añadimos el parametro
        * en este caso la entrada de datos (num1, num2)*/


        // PASAMOS CON UNOS EJERCICIOS :D


        //Preguntamos por el radio del circulo
        System.out.print("Introduce el radio del circulo: ");
        double r = dato.nextDouble(); // Permitimos por supuesto radios decimales

        //Llamamos a la funcion con esos parametros, pi y r (radio)
        double circulo = formulaCirculo(Math.PI, r); // Libreria MATH para el número PI (Math y se importa)
        System.out.println("El área del círculo es igual a: " + circulo); // Mostrar el resultado




        //Procedemos a preguntar sobre las medidas del triangulo
        System.out.println("Introduce la base del triangulo: ");
        double base = dato.nextDouble();

        System.out.println("Introduce la altura del triangulo: ");
        double altura = dato.nextDouble();

        //INVOCAMOS LA FUNCION DEL CALCULO DEL AREA DEL TRIANGULO
        double triangulo = areaTriangulo(base, altura);
        System.out.println("El area del triangulo es: " + triangulo);




        // Consumir el salto de línea pendiente antes de leer el nombre
        dato.nextLine(); // Agregar esta línea



        //Pedimos el nombre al usuario
        System.out.println("Dime tu nombre: ");
        //Nos entra el nombre por consola
        String nombre = dato.nextLine();
        //Llamamos la funcion e imprime el saludo personalizado.
        String saludoPersonal = generarSaludo(nombre);
        //System.out.println(generarSaludo(nombre));
        System.out.println(saludoPersonal);

        dato.close();
    }

    /*Ejercicio 1: Crear metodo que haga una suma de dos numeros*/
    public static int sumar(int a, int b) {
        return a + b;
    }

    /*Ejercicio 2: Calcular el área de un círculo*/
    public static double formulaCirculo(double pi, double radio) {
        return pi * radio * radio; // Calcular el área directamente en la función
    }

    /*Ejercicio 3: Calcular el area del triangulo*/
    public static double areaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }

    /*Ejercicio 4: Saludo Personalizado*/
    public static String generarSaludo(String nombre) {
        return "¡Hola, " + nombre + "!"; // Crear el saludo
    }
}
