/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author andyg
 */
public class Biblioteca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int metd = 0;
        
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        System.out.println("******************************************");
        System.out.println("BIBLIOTECA DE ARREGLOS Y MATRICES");
        System.out.println("******************************************");
        System.out.println("1. Shell Sort");
        System.out.println("2. Matriz Adjunta");
        System.out.println("3. Matriz Identidad");
        System.out.println("4. Matriz Inversa");
        System.out.println("5. Intercambiar los Minimos de A con los Maximos de B");
        System.out.println("6. Cuadro Mágico");
        System.out.println("7. Imprimir el Contenido Automatico de una Matriz en Espiral");
        System.out.println("8. Generar un Espiral en una Matriz");
        System.out.println("9. Sumar los Elementos de una Fila o Columna de una Matriz Cuadrada");
        System.out.println("10. Bubble Sort");
        System.out.println("11. Busqueda Binaria en una Matriz");
        System.out.println("12. Encuentra la Moda en un Arreglo");
        System.out.println("Elige una de las 12 opciones");
        System.out.println("******************************************");
        entrada = bufer.readLine();
        metd = Integer.parseInt(entrada);
        
        
         switch(metd){
    
    case 1:
        System.out.println("Shell Sort");
            Metodos.shellSort();
            System.exit(0);
    break;
    
    case 2:
        System.out.println("Matriz Adjunta");
        Metodos.matrizAdjunta();
        System.exit(0);
    break;
    
    case 3:
        System.out.println("Matriz Identidad");
        Metodos.matrizIdentidad();
        System.exit(0);
    break;
    
    case 4:
        System.out.println("Matriz Inversa");
        Metodos.matrizInversa();
        System.exit(0);
    break;
    
    case 5:
        System.out.println("Intercambiar los Elementos de la Primera Columna con los de la Ultima");
        Metodos.intercambioMatrices();
        System.exit(0);
    break;
    
    case 6:
        System.out.println("Cuadro Mágico");
        Metodos.matrizMagica();
        System.exit(0);
    break;
    
    case 7:
        System.out.println("Imprimir el Contenido Automatico de una Matriz en Espiral");
        Metodos.matrizEspiral();
        System.exit(0);
    break;
    
    case 8:
        System.out.println("Generar un Espiral en una Matriz");
        Metodos.espiralMatriz();
        System.exit(0);
    break;
    
    case 9:
        System.out.println("Sumar los Elementos de una Fila o Columna de una Matriz Cuadrada");
        Metodos.sumarFilasyColumnas();
        System.exit(0);
    break;
    
    case 10:
        System.out.println("Bubble Sort");
        Metodos.bubbleSort();
        System.exit(0);
    break;
    
    case 11:
        System.out.println("Busqueda Binaria en una Matriz");
        Metodos.busquedaBinaria();
        System.exit(0);
    break;
    
    case 12:
        System.out.println("Encuentra la Moda en un Arreglo");
        Metodos.modaArreglo();
        System.exit(0);
    break;
    
    default:
        System.out.println("Error el numero solicitado no existe dentro de los métodos");
        System.exit(0);
    break;
        }
    }
}
    
