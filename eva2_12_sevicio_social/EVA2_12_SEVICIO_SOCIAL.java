/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_sevicio_social;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_12_SEVICIO_SOCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int creditos, semestre;
        Scanner captu=new Scanner(System.in);
        System.out.println("¿Que semestres cursaste?");
        semestre =captu.nextInt();
        System.out.println("¿Cunatos creditos llevas?");
        creditos=captu.nextInt();
        //indicar si puede o no relizar el servicio social
        //ir en 6to semestre o superior(semestre>=6)
        //tener al menos 150 creditos(creditos>=150)
        if((semestre>=6)&&(creditos>=150))
            System.out.println("Puedes realizar el servicio social");
        else
            System.out.println("No puedes relizar el servio social");
    }
    
}
