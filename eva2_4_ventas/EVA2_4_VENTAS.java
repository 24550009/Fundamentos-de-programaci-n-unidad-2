/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad, calcSaldo;
        Scanner captu = new Scanner (System.in);
        System.out.println("¿cuantas piezas quires comprar?");
        cantidad= captu.nextInt();
        if(cantidad >1000)//verdadero
            calcSaldo= cantidad*500;
        else
            calcSaldo= cantidad*800;
        System.out.println("El saldo es"+calcSaldo);
        
    }
    
}
