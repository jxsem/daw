public class Condicionales {
    public static void main(String[] args) {

        // Condicionales if y else

        float promedio = 5.8f;
        if (promedio >= 6.5){
            System.out.println("Felicitaciones excelente promedio");
        } else if (promedio >= 6.0){
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0){
            System.out.println("Promedio regular");
        } else if (promedio >= 4.0){
            System.out.println("Insuficiente");
        } else{
            System.out.println("Suspenso");
        }
        System.out.println("Tu promedio es " + promedio);

        //Otro ejemplo con los meses bisiestos
        int anio = 2021;

        if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

        // Condicionales Switch case
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("Pre-fin de semana y fin de semana");
        }
    }

}
