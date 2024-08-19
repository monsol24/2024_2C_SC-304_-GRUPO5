/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodeportivo;

public class ListaParticipante {
    
    private NodoParticipante cabeza;
    private NodoParticipante ultimo;

    public ListaParticipante() {
        cabeza = null;
        ultimo = null;
    }

    public void inserta(Participante p) {
        NodoParticipante nuevoNodo = new NodoParticipante(p);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
            ultimo.setSiguiente(cabeza); // Lista circular
            cabeza.setAnterior(ultimo);
        } else if (p.getIdparticipante() < cabeza.getParticipante().getIdparticipante()) {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else if (ultimo.getParticipante().getIdparticipante() <= p.getIdparticipante()) {
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else {
            NodoParticipante aux = cabeza;
            while (aux.getSiguiente().getParticipante().getIdparticipante() < p.getIdparticipante()) {
                aux = aux.getSiguiente();
            }
            nuevoNodo.setSiguiente(aux.getSiguiente());
            nuevoNodo.setAnterior(aux);
            aux.setSiguiente(nuevoNodo);
            nuevoNodo.getSiguiente().setAnterior(nuevoNodo);
        }
    }

    public void modifica(Participante p) {
        if (cabeza != null) {
            NodoParticipante aux = cabeza;
            boolean modificado = false;
            do {
                if (aux.getParticipante().getIdparticipante() == p.getIdparticipante()) {
                    aux.getParticipante().setNombre(p.getNombre());
                    aux.getParticipante().setEquipo(p.getEquipo());
                    aux.getParticipante().setEdad(p.getEdad());
                    modificado = true;
                } else {
                    aux = aux.getSiguiente();
                }
            } while (aux != cabeza && !modificado);
        }
    }

    public void elimina(int id) {
        if (cabeza != null) {
            NodoParticipante aux = cabeza;
            boolean eliminado = false;
            do {
                if (aux.getParticipante().getIdparticipante() == id) {
                    if (aux == cabeza) {
                        if (ultimo == cabeza) { // Cuando solo hay un elemento
                            cabeza = null;
                            ultimo = null;
                        } else {
                            cabeza = cabeza.getSiguiente();
                            ultimo.setSiguiente(cabeza);
                            cabeza.setAnterior(ultimo);
                        }
                    } else if (aux == ultimo) {
                        ultimo = ultimo.getAnterior();
                        ultimo.setSiguiente(cabeza);
                        cabeza.setAnterior(ultimo);
                    } else {
                        aux.getAnterior().setSiguiente(aux.getSiguiente());
                        aux.getSiguiente().setAnterior(aux.getAnterior());
                    }
                    aux.setSiguiente(null);
                    aux.setAnterior(null);
                    eliminado = true;
                } else {
                    aux = aux.getSiguiente();
                }
            } while (aux != cabeza && !eliminado);
        }
    }

    @Override
    public String toString() {
        if (cabeza == null) {
            return "Lista vacía";
        }
        return recorrerLista(cabeza, cabeza);
    }

    private String recorrerLista(NodoParticipante actual, NodoParticipante cabeza) {
        if (actual.getSiguiente() == cabeza) {
            return actual.getParticipante().toString(); // Mostrar el último elemento 
        }
        return actual.getParticipante().toString() + "\n" + recorrerLista(actual.getSiguiente(), cabeza);
    }

    // Método para buscar un participante por ID de forma recursiva
    public Participante buscarParticipante(int id) {
        return buscarParticipanteRecursivo(cabeza, id, cabeza);
    }

    private Participante buscarParticipanteRecursivo(NodoParticipante actual, int id, NodoParticipante cabeza) {
        if (actual == null || (actual.getSiguiente() == cabeza && actual.getParticipante().getIdparticipante() != id)) {
            return null; // Elemento no encontrado
        }
        if (actual.getParticipante().getIdparticipante() == id) {
            return actual.getParticipante(); // Elemento encontrado
        }
        return buscarParticipanteRecursivo(actual.getSiguiente(), id, cabeza); // Continuar búsqueda
    }
}
