/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calificaciones_tipo_americano;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_14_CALIFICACIONES_TIPO_AMERICANO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner captu=new Scanner(System.in);
        System.out.println("Introducetu Calificaciondel 1-100");
        cali=captu.nextInt();
        if(cali>=90&&cali<=100)
            System.out.println("Tienes una A");
        else if(cali>=80&&cali<=89)
            System.out.println("Tienes una B");
        else if(cali>=70&&cali<=79)
            System.out.println("Tienes una C");
        else if(cali>=60&&cali<=69)
            System.out.println("Tienes una D");
        else if(cali>=0&&cali<=59)
            System.out.println("Tienes una F");
        else
            System.out.println("No intridujiste una calificación valida");
    }
    
}
