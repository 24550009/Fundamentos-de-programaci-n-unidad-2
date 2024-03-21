/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_7_PAR_IMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, divi, residuo;
        Scanner captu=new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        num=captu.nextInt();
        divi=num/2;
        System.out.println("Divicion enterea de "+ num+"/2="+divi);
        residuo= num %2;
        System.out.println("El residuo de nuestro numero  "+ num+"%2="+residuo);
        if(residuo==1)
            System.out.println("El numero es inmpar ");
        else
            System.out.println("El numeroe es par");
                
                
    }
    
}
