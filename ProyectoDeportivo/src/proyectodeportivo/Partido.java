/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

/**
 *
 * @author HP
 */
public class Partido {
    
    private String equipo1;
    private String equipo2;
    private String resultado;

    public Partido(String equipo1, String equipo2, String resultado) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return equipo1 + " vs " + equipo2 + " - Resultado: " + resultado;
    }
}


