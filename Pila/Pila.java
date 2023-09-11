/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author Eduardo
 */
public class Pila {

    private Nodo cima;
    private int tamanio;

    public Pila() {
        cima = null;
        tamanio = 0;
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setNodo(cima);
        cima = nuevo;
        tamanio++;
    }

    public void quitar() {
        cima = cima.getNodo();
        tamanio--;
    }

    public boolean estaVacia() {
        if (cima == null)
            return true;
        return false;
    }

    public void vaciar() {
        while (estaVacia() != true) 
            quitar();
        
    }

    public int obtenerCima() {
        if (cima.getNodo() != null) 
            return cima.getDato();
        return 0;
    }

    public int getTamanio() {
        return tamanio;
    }

}
