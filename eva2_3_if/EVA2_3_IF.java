/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_3_IF {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double calificacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agrega tu calificacion:");
        calificacion= scanner.nextDouble();
        if (calificacion>=70)
            System.out.println("aprobatoria");
    else
         
            System.out.println("suerte para la proxima");
    
        
    }
    
}
