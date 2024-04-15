/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_20_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PREGUNTAR UN MENSAJE
        //PREGUNTAR CUANTAS VECES LO VAN A REPETIR:IMPRIMIR ESE NUMERO DE VECES
        
        //imprimir la sumatoria de un numero
        //solicictar un numeroe entero, calcular la sumatoria
        //ejemplo el usuario introduce 5
        //calcular 1+2+3+4+5
        
        //capturar un numero e imprimimr una secuencia de *.
        //Ejemplo: el usuario captura 5:NOTA: se necesita un for dentgro de otro for
        //*
        //**
        //***
        //****
        //*****
        String mensaje;
        int veces;
        Scanner captu=new Scanner(System.in);
        System.out.println("Introduce tu mensaje");
        mensaje= captu.next();
        System.out.println("¿Cuntas veces quieres repetir tu mensaje?");
        veces= captu.nextInt();
        
        System.out.println("");
        for (int i = 0; i < veces; i++) {
            System.out.println(":"+mensaje);
        }
        int entero,sumatoria;
        sumatoria=0;
        System.out.println("introduce un numero para ver su sumatoria:");
        entero = captu.nextInt();
        for (int i = 1; i <= entero; i++) {
            sumatoria+=i;
            System.out.print(i);
            if(i<entero) System.out.print("+");
        }
        System.out.println(" = "+sumatoria);
        System.out.println("");
        
        int num;
        System.out.println("introduce un numero entero:");
        num=captu.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
                }
            System.out.println("");
            }
        for (int k = num; k >= 1; k--) {
            for (int i = 1; i <= k; i++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
        }
    }
    

