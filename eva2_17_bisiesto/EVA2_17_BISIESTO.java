/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Divisible entre 4 exepto aquellos divisibles entre 100
        //(pero si es divisible entre entre 100, es bisiesto sie es divicible entre 400)
        int año,res,res2,res3;
        Scanner captu=new Scanner(System.in);
        System.out.println("Ingrese un año para saber si fue bisiesto:");
        año=captu.nextInt();
        res=año%4;
        res2=año%100;
        res3=año%400;
        if((res==0&&res2!=0)||res3==0)
            System.out.println("El año es biciesto");
        else
            System.out.println("El año no es biciesto");
        

    }
    
}
