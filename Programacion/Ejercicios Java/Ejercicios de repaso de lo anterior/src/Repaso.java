import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {
        // Ejercicios con if-else y switch-case

        //Verificación de números pares o impares
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero_par = dato.nextInt();
        dato.nextLine();

        if (numero_par > 0){
            System.out.println("El numero es positivo");
            if (numero_par % 2 == 0){
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }else
            System.out.println("El numero es negativo");

        //Imprimir números del 1 al 100
        int lista_numeros = 100;

        for(int i = 0; i <= lista_numeros; i++ ){
            System.out.println("Numero " +i);
        }

        //Sumar números del 1 al N
        System.out.println("Introduce un numero positivo");
        int numero_n = dato.nextInt();
        dato.nextLine();

        int suma = 0;
        for(int i = 1; i <= numero_n; ++i){
            suma = suma + i;
        }
        System.out.println("La suma es: " + suma);

        // Tabla de multiplicar
        System.out.println("Introduce un numero para hacer su tabla de multiplicar");
        int multiplicador = dato.nextInt();
        dato.nextLine();
        for(int i = 1; i <= 10; i++){
            System.out.println(multiplicador + " x " + i + " = " + (multiplicador * i));
        }

        //Contar números pares e impares.
        System.out.println("Introduce un numero para contar cuantos numeros pares e impares hay entre el 1 hasta su numero: ");
        int contador_numeros = dato.nextInt();
        System.out.println("Aqui tiene los numeros pares e impares desde el 1 hasta el " + contador_numeros);
        for(int i = 1; i <=contador_numeros; ++i){
            if (i % 2 == 0){
                System.out.println("El numero " + i + " es par");
            }else {
                System.out.println("El numero " + i + " es impar");
            }
        }

        // ¡ADIVINANZAS! Crea un programa que elija un número aleatorio entre 1 y 100 y le pida al usuario que adivine el número.
        System.out.println("¡Adivina el numero que estoy pensando");
        int usuario = dato.nextInt();
        final int adivinanza = 80;

        while (usuario != adivinanza) {
            // Comprobar si la adivinanza es correcta
            if (usuario < adivinanza) {
                System.out.println("Demasiado bajo, intenta de nuevo.");
            } else if (usuario > adivinanza) {
                System.out.println("Demasiado alto, intenta de nuevo.");
            }
            // Solicitar otro número al usuario
            usuario = dato.nextInt();
        }
        System.out.println("¡Enhorabuena, has adivinado el número!");

        // Contador de Dígitos
        int contador_digitos;

        while (true) { // Hacemos un bucle para que pida siempre un numero hasta que sea un digito mayor que 0
            System.out.println("Introduce un número entero positivo: ");
            contador_digitos = dato.nextInt();

            if (contador_digitos > 0) { // Si es mayor que cero hacemos un break, y salimos del bucle y vamos al siguiente bucle
                break; // Salir del bucle si el número es positivo
            } else {
                System.out.println("El número no es positivo, inténtalo de nuevo.");
            }
        }

        // Contar los dígitos del número
        int contador = 0; // contador iniciado para contar los digitos
        int numero = contador_digitos; // Al crear una copia del valor original (int numero = contador_digitos;), podemos dividir numero sin afectar a contador_digitos, preservando su valor original.
        // Esto es útil si más adelante necesitamos usar el número ingresado por el usuario para otros cálculos o para mostrarlo
        while (numero != 0) { // mientras que numero sea diferente a cero
            numero = numero / 10; // numero será, numero dividivo entre 10
            contador++; // Se acumula el numero de veces que se divide el numero
        }

        // Mostrar el resultado
        System.out.println("El número tiene " + contador + " dígitos."); // Se itera contador para saber cuantas veces se ha dividido y así te dice cuantos digitos tiene

        //  Adivinar un Número
        int numeroAdivinado;
        int numeroAdivinar = 8;

        do {
            System.out.println("Introduce un numero del 1 al 10: ");
            numeroAdivinado = dato.nextInt();

            if (numeroAdivinado > numeroAdivinar){
                System.out.println("Demasiado alto");
            } else if (numeroAdivinado < numeroAdivinar) {
                System.out.println("Demasiado bajo");
            }else {
                System.out.println("Numero Correcto");
            }
        }while (numeroAdivinar != numeroAdivinado);

        System.out.println("Numero Correcto");


        // Menú de opciones (sumar, restar, multiplicar o salir)

        int opcion;

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");

            opcion = dato.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción de suma seleccionada.");
                    break;
                case 2:
                    System.out.println("Opción de resta seleccionada.");
                    break;
                case 3:
                    System.out.println("Opción de multiplicación seleccionada.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

    }
}



