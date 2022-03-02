// Tarea uso de Java
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// Clase Dado

import java.util.Random; // Importa Random

public class Dado {
    int caras = 0; // También representa el rango máximo a la hora de usar random
    // Rangos del random
    int min = 1;
    // Se crea un objeto de la clase Random
    Random random = new Random();
    int rnd = random.nextInt(42);

    // Create a class constructor
    public Dado (int numCaras){ // Constructor
        caras = numCaras; // Cambia el número de caras (atributo) según el parámetro ingresado
    }

    public int lanzar(){ // Método
        int random_int = (int)Math.floor(Math.random()*(caras-min+1)+min); // Aleatoriza un número entre un rango
        return random_int; // Retorna ese número
    }
}
