// Crea una nueva variable double llamada saldoActualizado y 
// almacene saldo con cantidadARetirar restada de él.

// Ahora, imagina que has decidido dividir tu saldo en 3 partes 
// iguales para dárselo a tus tres mejores amigos. Crea una variable 
// double llamada cantidadParaCadaAmigo que contenga saldoActualizado dividido por 3.

// Si cada uno de tus amigos quiere comprar un boleto para un concierto 
// con el dinero que les diste. Y las entradas cuestan 250. Crea una variable de 
// tipo boolean llamado puedeComprarTicket y configúralo de tal manera que arroje si 
// cantidadParaCadaAmigo tiene lo suficiente para comprar una entrada para el concierto. 
// Entonces, usa System.out.println() para imprimir puedeComprarTicket.

// Usa + y System.out.println() para imprimir con el valor de cantidadParaCadaAmigo 
// en lugar de <cantidadParaCadaAmigo>.

public class CuentaBancaria {
    
    public static void main(String[] args) {
        
        double saldo = 1000.75;
        double cantidadARetirar = 250;
        double saldoActualizado = saldo - cantidadARetirar;
        double cantidadParaCadaAmigo = saldoActualizado/3;
        boolean puedeComprarTicket = cantidadParaCadaAmigo > 250;
        System.out.println("Le di a cada amigo" + cantidadParaCadaAmigo);
        System.out.println("¿Pueden comprar ticket?:"+ puedeComprarTicket);
    
    }    
}