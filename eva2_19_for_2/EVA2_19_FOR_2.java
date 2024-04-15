/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_19_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Preguntas: Cantidad de estudiante
        int cantAlumnos;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿Cuantos estudiantes tiene el grupo?");
        cantAlumnos= captu.nextInt();
        //hay que capturar todas la calificaciones
        for (int i = 0; i < cantAlumnos; i++) {
            //todo depende donde empiesas y donde acavas
            //int i = 0; i < cantAlumnos; i++
            //int i = 1; i <= cantAlumnos; i++
            //ambos for hacen lo mismo cuntan kla misma cantidad de elemtos
            System.out.println("Calificacaión");
            int cali=captu.nextInt();
            
        }
    }
    
}
