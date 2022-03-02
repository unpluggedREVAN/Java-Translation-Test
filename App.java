// Tarea uso de Java
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// Clase principal

import java.util.Scanner; // importar el Scanner class 

public class App { // Clase principal
    public static void main(String[] args) throws Exception {
        System.out.println("Juego automático de tablero"); // Impresión

        Scanner myObj = new Scanner(System.in); // Genera instancia myObj
        int cantCasillas; // Declara variable int cantCasillas
        int cantFichas; // Declara variable int cantFichas
        String col; // Declara String col
    
        System.out.println("Ingrese la cantidad de casillas: "); 
        cantCasillas = myObj.nextInt(); // Lee los datos de teclado con myObj
        
        System.out.println("Ingrese la cantidad de fichas: ");
        cantFichas = myObj.nextInt(); // Lee los datos de teclado con myObj

        Tablero tab = new Tablero (cantCasillas); // Inicializa el tablero con la cantidad de casillas

        for (Integer i = 1; i <= cantFichas; i++ ) { // Se genera un ciclo para pedir los datos de las fichas
            System.out.println("");
            System.out.println("Ficha " + i);
            System.out.println("Ingrese el color: ");
            col = System.console().readLine(); // Lee los datos de teclado
            tab.ingresaObjeto(col); // Llama al método ingresaObjeto dentro de tablero en cada ciclo
        }

        tab.orden(); // Llama al método orden que aleatoriza la lista de objetos

        int i = 0; // Contador
        while (tab.ganador == ""){ // Ciclo para repetir juego hasta que se encuentre a un ganador
            int este = i; // Copia i en este
            if (este >= tab.fichas.size()){ // Condición si el contador este es mayor o igual al total de elementos de la lista
                este = 0; // Cambia el valor del contador
                i = 0; // Cambia el valor del contador
            }
            System.out.println("\nTurno del: " + tab.fichas.get(este).color); // En cada ciclo indica de quién es el turno actual
            tab.partida(tab.fichas.get(este)); // Llama al método partida con el objeto actual
            tab.ganar(); // Verifica si en el ciclo actual ya hubo un ganador
            i += 1; // Aumenta el contador
        }
        System.out.println("\nEl ganador es: " + tab.ganador); // Imprime en pantalla el ganador
        myObj.close();
    }
}
