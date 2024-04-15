/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_adivinar;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_21_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=5;//numeor que tiene que adivinar (entre 1 y 10)
        int valor=0;//valor para almacenar lo que captura el usuario
        Scanner captu=new Scanner(System.in);
        do{
            System.out.println("¿Cual es el numeor?(entre 1 y 10)");
            valor= captu.nextInt();
        }while(num!=valor);
        System.out.println("ADIVINASTE");
        
    }
    
}
