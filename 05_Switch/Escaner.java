// Programa 1. (3 puntos) Crea el código en Java bajo las siguientes instrucciones:

// Importa la clase Scanner para la lectura de datos.

// Crea un objeto semana de la clase Scanner.

// Crea una variable dia de tipo entero.
// Imprime el texto Introduce un número del 1 al 7 para conocer el día de la semana, para hacer 
// la lectura de el dato desde teclado y almacenarlo en la variable dia.
// Crea una estructura switch-case, donde la variable a comparar con todos los casos es dia.
// En cada caso, coloca e imprime cada día de la semana (comenzando el Lunes).
// Si se ingresa un número de día no válido, imprime el mensaje Número no válido.
// Toma captura de pantalla del código completo y del programa compilado.

import java.util.Scanner;

public class Escaner {

    public static void main(String[] args) {
        int dia=0;
        String texto ="";
        Scanner diaDeLaSemana = new Scanner(System.in);
        System.out.println(" Introduce un número del 1 al 7 para conocer el día de la semana: ");
        dia = diaDeLaSemana.nextInt();

        switch (dia) {
            case 1:
                texto = "Es lunes.";
                break;

            case 2:
            texto = "Es Martes.";
                break; 
            
            case 3:
            texto = "Es Miercoles.";
                break; 
            
            case 4:
            texto = "Es Jueves.";
                break; 

            case 5:
            texto = "Es Viernes.";
                break; 

            case 6:
            texto = "Es Sabado.";
                break; 

            case 7:
            texto = "Es Domingo.";
                break; 


            default:
            System.out.println("Numero no valido.");
                break;
        }
    System.out.println(texto);
    }
}
