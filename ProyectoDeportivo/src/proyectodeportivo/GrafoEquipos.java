/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author HP
 */
// Clase Nodo que representa un equipo
class Nodo {
    String nombre;
    Nodo siguiente;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}

// Clase Grafo que representa el grafo de equipos
class Grafo {
    Nodo[] equipos;
    int[][] matrizAdyacencia;
    int numEquipos;

    public Grafo(int maxEquipos) {
        equipos = new Nodo[maxEquipos];
        matrizAdyacencia = new int[maxEquipos][maxEquipos];
        numEquipos = 0;

        // Inicializar la matriz de adyacencia
        for (int i = 0; i < maxEquipos; i++) {
            for (int j = 0; j < maxEquipos; j++) {
                matrizAdyacencia[i][j] = 0;
            }
        }
    }

    public void agregarEquipo(String nombre) {
        equipos[numEquipos++] = new Nodo(nombre);
    }

    public void agregarPartido(int i, int j) {
        matrizAdyacencia[i][j] = 1;
        matrizAdyacencia[j][i] = 1; // Grafo no dirigido
    }

    public String mostrarGrafo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numEquipos; i++) {
            sb.append(equipos[i].nombre).append(" está conectado con: ");
            for (int j = 0; j < numEquipos; j++) {
                if (matrizAdyacencia[i][j] == 1) {
                    sb.append(equipos[j].nombre).append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}



