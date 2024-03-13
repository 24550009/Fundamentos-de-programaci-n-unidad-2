/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_cmparara;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_6_CMPARARA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CUAL ES EL MAYOR VALOR ENTRE DOS NUMEROS
        //PIDAN AL USUARIO DOS VALORES ENTEROS
        int valor1,valor2;
        Scanner captu=new Scanner(System.in);
        System.out.println("introdusca priemr numero:");
        valor1= captu.nextInt();
        System.out.println("introdusca segundo numero:");
        valor2= captu.nextInt();
        //CUAL ES EL MAYOR
        if(valor1>valor2)
            System.out.println(valor1+"es mayor!!!");
        else{
            if(valor1==valor2)//valor1 es igual a valor2?
                System.out.println("Son iguales");
            else
                System.out.println(valor2+"es maor!!!");
            
        }
        
    }
    
}
