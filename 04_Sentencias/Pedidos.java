// Escribe una declaración usando if que imprima ¡El valor del 
// artículo es alto! cuando costoArticulo es mayor que 24.00.

// En el código de arriba hay variable listoEnviar cuyo valor representa 
// si el pedido está listo para enviarse. Escribe un enunciado if-then-else que:

// Cuando listoEnviar sea verdadero (true), imprima Enviado.
// Cuando listoEnviar sea falso (false), imprima Pedido no listo.
// Toma captura de pantalla del código completo y del programa compilado.

// Programa 2. (5 puntos) Realiza un programa en java que imprima los 
// primeros 15 elementos de alguna de las siguientes series haciendo uso necesariamente 
// de las sentencias de control:

// Serie de números impares positivos
// 1, 3, 5, 7, 9, 11, 13, 15, 17, .... así sucesivamente.

// Serie de Fibonacci
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... así sucesivamente.

// Toma captura de pantalla del código completo y del programa compilado.

public class Pedidos {

    public static void main(String[] args) {
        
        double costoArticulo = 30.99;
        boolean listoEnviar = false;
    
        if (costoArticulo>24) {
            System.out.println("El valor del articulo es alto");
       
            if (listoEnviar == true) {
                System.out.println("Enviado");
            } 
            else {
                System.out.println("Pedido no listo");
            }
        }
    }
    
}
