/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_switch;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_16_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu= new Scanner(System.in);
        System.out.println("Introduce el numero del mes(1-12):");
        mes=captu.nextInt();
        switch(mes){
            case 1:
                System.out.println("Enero");
                break;//termina el switch
            case 2:
                System.out.println("Febrero");
                break;//termina el switch
            case 3:
                System.out.println("Marzo");
                break;//termina el switch
            case 4:
                System.out.println("Anbril");
                break;//termina el switch
            case 5:
                System.out.println("Mayo");
                break;//termina el switch
            case 6:
                System.out.println("Junio");
                break;//termina el switch
            case 7:
                System.out.println("Julio");
                break;//termina el switch
            case 8:
                System.out.println("Agosto");
                break;//termina el switch
            case 9:
                System.out.println("Septiembre");
                break;//termina el switch
            case 10:
                System.out.println("Octubre");
                break;//termina el switch
            case 11:
                System.out.println("Noviembre");
                break;//termina el switch
            case 12:
                System.out.println("Diciembre");
                break;//termina el switch
            default:
                System.out.println("Numero de mes no valido");
           
        }
    }
    
}
