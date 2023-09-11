/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pila;

/**
 *
 * @author Eduardo
 */
public class CreacionPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila = new Pila();

        pila.insertar(14);
        pila.insertar(27);
        pila.insertar(15);
        pila.insertar(10);
        pila.insertar(90);
        pila.insertar(71);
        pila.insertar(37);
        pila.insertar(2);
        pila.insertar(48);

        System.out.println("El tamano de la pila es: " + pila.getTamanio());
        pila.quitar();
        pila.quitar();
        pila.quitar();
        pila.quitar();
        System.err.println("Se quitaron 4 elementos de la pila");
        System.out.println("La cima de la pila es: " + pila.obtenerCima());
        pila.vaciar();
        System.err.println("Se vacio toda la pila");
        System.out.println("La pila esta vacia?: " + pila.estaVacia());

    }

}
