/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_2c_sc.pkg304_.grupo5;

/**
 *
 * @author rcalv
 */
public class Resultado {
    
    private Partido partido;
    private int golesLocal;
    private int golesVisitante;

    public Resultado(Partido partido, int golesLocal, int golesVisitante) {
        this.partido = partido;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
    
    
}
