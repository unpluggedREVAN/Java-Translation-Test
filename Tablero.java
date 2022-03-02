// Tarea uso de Java
// Jose Pablo Agüero Mora (2021126372) - Grupo 2
// Clase Tablero

import java.util.*;
public class Tablero {
    int casillas; // Atributo int
    ArrayList<Ficha> fichas = new ArrayList<Ficha>(); // Genera un arreglo de objetos clase Ficha
    String ganador; // Atributo String

    public Tablero (int casi){ // Constructor
        casillas = casi; // Inicializa el valor de casillas con el parámetro
        ganador = ""; // Inicializa ganador con ""
    }

    public void orden(){ // Método
        Collections.shuffle(fichas); // Aleatoriza el orden de los elementos en la lista
    }

    public void ganar(){ // Método
        for (int i=0;i<fichas.size();i++) { // Ciclo que recorre la lista fichas
            if (fichas.get(i).posicion >= casillas){ // Condición: Si uno de los objetos tiene una posición mayor al número de casillas, cambia el valor de ganador
                ganador = fichas.get(i).color; // Cambia el atributo de ganador
            }
        }
    }

    public void partida(Ficha fich){ // Método
        fich.avanzar(); // Llama al método avanzar / Tira el dado y usa el turno
    }

    public void ingresaObjeto (String col){ // Método
        Ficha ficha = new Ficha (col); // Genera un objeto de clase Ficha
        ficha.color = col; // Modifica el atributo color con el parámetro
        fichas.add(ficha); // Añade el objeto a la lista fichas
    }
}