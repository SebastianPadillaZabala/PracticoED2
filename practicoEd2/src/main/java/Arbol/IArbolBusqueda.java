/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;
import java.util.List;
/**
 *
 * @author Sebastian Padilla
 * @param <K>
 * @param <V>
 */
public interface IArbolBusqueda<K extends Comparable <K>, V> {
  void insertar(K clave, V valor) throws ExcepcionClaveYaExiste;
    V eliminar(K clave) throws ExcepcionClaveNoExiste;
    V buscar(K clave);
    boolean contiene(K clave);
    List<K> recorridoEnInOrden();
    List<K> recorridoEnPreOrden();
    List<K> recorridoEnPostOrden();
    List<K> recorridoPorNiveles();
    int size();
    int altura();
    void vaciar();
    boolean esArbolVacio();
    int nivel();  
    void mostrarArbol();
    int ejercicio1();   
    int ejercicio2();
    int ejercicio3(int nivel);
    int ejercicio4(int nivel);
    int ejercicio5(int nivel);
    boolean ejercicio6();
    boolean ejercicio7();
    int ejercicio12(int nivel);
}
