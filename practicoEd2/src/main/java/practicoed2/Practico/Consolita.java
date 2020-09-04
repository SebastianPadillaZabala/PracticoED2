/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicoed2.Practico;

import Arbol.AVL;
import Arbol.ArbolBinarioBusqueda;
import Arbol.ExcepcionClaveNoExiste;
import Arbol.ExcepcionClaveYaExiste;
import Arbol.IArbolBusqueda;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sebastian Padilla
 */
public class Consolita {

    /**
     * @param args the command line arguments
     * @throws Arbol.ExcepcionClaveYaExiste
     * @throws Arbol.ExcepcionClaveNoExiste
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ExcepcionClaveYaExiste, ExcepcionClaveNoExiste, IOException {
        // TODO code application logic here
        IArbolBusqueda<Integer, String> arbol = new ArbolBinarioBusqueda<>();
        IArbolBusqueda<Integer, String> arbolAVL = new AVL<>();
        arbol.insertar(50, "diego");
        arbol.insertar(60, "oscar");
        arbol.insertar(40, "liz");
        arbol.insertar(39, "enzo");
        arbol.insertar(45, "julio");
        arbol.insertar(70, "oso");
        arbol.insertar(20, "dudu");
        arbol.insertar(22, "diana");
        
         arbolAVL.insertar(50, "diego");
        arbolAVL.insertar(60, "oscar");
        arbolAVL.insertar(40, "liz");
        arbolAVL.insertar(39, "enzo");
        arbolAVL.insertar(45, "julio");
        arbolAVL.insertar(70, "oso");
        arbolAVL.insertar(20, "dudu");
        arbolAVL.insertar(22, "diana");
        ((ArbolBinarioBusqueda) arbol).mostrarArbol();
        ((ArbolBinarioBusqueda) arbolAVL).mostrarArbol();
        System.out.println("1) Ejercicio 1");
            System.out.println("2) Ejercicio 2");
            System.out.println("3) Ejercicio 3");
            System.out.println("4) Ejercicio 4");
            System.out.println("5) Ejercicio 5");
            System.out.println("6) Ejercicio 6");
            System.out.println("7) Ejercicio 7");
            System.out.println("8) Ejercicio 8");
            System.out.println("9) Ejercicio 9");
            System.out.println("10) Ejercicio 10");
            System.out.println("11) Ejercicio 11");
            System.out.println("12) Ejercicio 12");
        int num = 1;
        Scanner entrada = new Scanner(System.in);
        Scanner nivel = new Scanner(System.in);
        while (num != 0) {
            num = entrada.nextInt();
            switch (num) {
                case 1: {
                    System.out.print("La cantidad de nodos hojas iterativo es: " );
                    System.out.println(arbol.ejercicio1());
                    break;
                }
                case 2: {
                    int resultado = arbol.ejercicio2();
                    System.out.print("La cantidad de nodos hojas iterativo es: " );
                    System.out.println(resultado);
                    break;
                }
                case 3: {
                    System.out.println("Teclee el nivel a manejar: ");
                    int resultado = arbol.ejercicio3(2);
                    System.out.print("La cantidad de nodos hojas (recursivo) es: ");
                    System.out.println(resultado);
                    break;
                }
                case 4: {
                    System.out.println("Teclee el nivel a manejar: ");
                    
                    int resultado = arbol.ejercicio4(2);
                    System.out.println("La cantidad de nodos hojas (iterativo) es: ");
                    System.out.println(resultado);
                    break;
                }
                case 5: {
                    System.out.println("Teclee el nivel a manejar: ");
                    int resultado = arbol.ejercicio5(2);
                    System.out.println("La cantidad de nodos hojas (iterativo): ");
                    System.out.println(resultado);
                    break;
                }
                case 6: {
                    boolean b;
                    b = arbol.ejercicio6();
                    System.out.println("El arbol binario cumple con las reglas del AVL?: ");
                    System.out.println(b);
                    break;
                }
                case (7): {
                    boolean b;
                    b = arbol.ejercicio7();
                    System.out.println("El arbol binario cumple con las reglas del AVL?: ");
                    System.out.println(b);
                    break;
                }
                case 8: {
                System.out.println("Esta codificado en la clase");
                break;
                }
                case 9: {
                 System.out.println("Esta codificado en su clase");
                break;
                }
                case 10: {
                System.out.println("Esta codificado en su clase");
                break;
                }
                case 11: {
                arbolAVL.eliminar(45);
                break;
                }
                case 12: {
                 System.out.print("Cantidad de nodos con dos hijos: ");
                 System.out.println(arbol.ejercicio12(2));
                break;
                }
            }
        }
    }

}
