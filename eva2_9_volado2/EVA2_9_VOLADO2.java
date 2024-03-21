/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_9_VOLADO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneda,mon,residuo;
        moneda=Math.random();    
        System.out.println("elige una cara de la moneda, 1 para CARA 2 para CRUZ");
        Scanner captu=new Scanner(System.in);
        mon=captu.nextDouble();
        
        if(mon==1)
            System.out.println("Elegiste CARA");
        else
            System.out.println("Elegiste CRUZ");
        
        if(moneda>.5)
            System.out.println("CALLO CARA");
        else
            System.out.println("CALLO CRUZ");
        if(moneda>.5 && mon==1)
            System.out.println("Ganaste");
        else{
            if(moneda<.5&&mon==1)
                System.out.println("perdiste");
            else{
                if(moneda<.5&&mon==2)
                    System.out.println("ganste");
                else
                    System.out.println("perdiste");
            }
        }
            
        System.out.println("el valor de la moneda es:"+moneda);  
    }
    
}
