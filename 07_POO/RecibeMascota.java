// Programa 1. (3 puntos) Crea un programa que forme parte de un módulo
// para el sistema de una estética de perros. El programa deberá de contener lo siguiente:

// Una clase RecibeMascota.

// Los atributos: nombre de perro, edad, raza, tamaño y nombre de dueño.
// Crear el método main en donde contendrá el código para realizar el siguiente procedimiento: 
// Crear un arreglo dinámico de tipo de la clase.
// Hacer una instancia para crear un objeto de tipo de la clase.
// Asignar valores a los atributos de la clase con datos que tú prefieras.
// Agregar el objeto creado al arreglo.
// Imprimir la cantidad de perros que se encuentran en la estética con el siguiente mensaje: 
// Perros actuales en la estética: <Número de perros>.

public class RecibeMascota {
    // Atributos
    String nombrePerro;
    int edad;
    String raza;
    String tamaño;
    String nombreDueño;

    // Método main
    public static void main(String[] args) {

        RecibeMascota[] arregloMascotas = new RecibeMascota[2];

        RecibeMascota perro1 = new RecibeMascota();

        perro1.nombrePerro = "Marte";
        perro1.edad = 5;
        perro1.raza = "Guapo";
        perro1.tamaño = "Mediano";
        perro1.nombreDueño = "Aldo";

    
        RecibeMascota perro2 = new RecibeMascota();

        perro2.nombrePerro = "Mia";
        perro2.edad = 6;
        perro2.raza = "Chihuahua";
        perro2.nombreDueño = "Aldo";

        arregloMascotas[0] = perro1;
        arregloMascotas[1] = perro2;

        System.out.println("Perros actuales en la estética: " + arregloMascotas.length);
        System.out.println("Nombre: "+ perro1.nombrePerro + ", Edad: "+ perro1.edad +", Dueño: " + perro1.nombreDueño);
    
        System.out.println("Perros actuales en la estética: " + arregloMascotas.length);
        System.out.println("Nombre: "+ perro2.nombrePerro + ", Edad: "+ perro2.edad +", Dueño: " + perro2.nombreDueño);
    
    }
}
