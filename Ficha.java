// Tarea uso de Java
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// Clase Ficha

public class Ficha {
    String color = ""; // Atributo String
    int posicion; // Atributo posicion
    Dado dado = new Dado(6); // Crea un objeto con la clase Dado

    public Ficha (String pcolor){ // Constructor
        color = pcolor; // Inicializa color según parámetro
        posicion = 0; // Inicializa posicion en 0
    }

    public void avanzar(){ // Método
        int pasos = dado.lanzar(); // Se usa el método lanzar de dado para ver cuántos pasos avanza la ficha en su turno
        posicion += pasos; // La posición suma esos pasos al número original
        System.out.println("Se mueve: " + pasos); // Imprime datos en pantalla
        System.out.println("Casilla actual: " + posicion); // Imprime datos en pantalla
    }
}