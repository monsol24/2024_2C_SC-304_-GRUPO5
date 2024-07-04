/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author rcalv
 */

    package pkg2024_2c_sc.pkg304_.grupo5;

// SistemaGestionEventos.java
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class SistemaGestionEventos {
    private Queue<Partido> colaPartidos; // Cola para programar partidos
    private Stack<Resultado> historialResultados; // Pila para el historial

    public SistemaGestionEventos() {
        colaPartidos = new LinkedList<>();
        historialResultados = new Stack<>();
    }

    // Métodos públicos para programar partidos, registrar resultados.
    public void programarPartido(Partido partido) {
        colaPartidos.add(partido);
    }

    public void registrarResultado(Resultado resultado) {
        historialResultados.push(resultado);
    }
    
    

    
}

