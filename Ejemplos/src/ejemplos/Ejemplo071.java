/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo071 {

    /**
     * @param args the command line arguments
     */
    //JUAN DAVID GARCIA CARRION.
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int dato;
        int suma = 0;
        String mensaje ="";
        int[] arreglo1 = new int[5];


        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Ingrese un valor para el arreglo");
            dato = entrada.nextInt();
            mensaje=mensaje+dato+"\n";
            arreglo1[i] = dato;
        }

        for (int i = 0; i < arreglo1.length; i++) {

            suma = suma + arreglo1[i];
        }

        
        System.out.println("La suma de los valores del arreglo: "+"\n"+mensaje+
                "es: "+ suma);
        
    }

}
