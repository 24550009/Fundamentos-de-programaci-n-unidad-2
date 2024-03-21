/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_volado;

/**
 *
 * @author artas
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //numero aleatorio en Java
        //valores entre 0 y 1
        //0.43242424324
        //0.1212331212
        
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de moneda="+moneda);
        
        //0.5 es la mitad del rango
        if(moneda>0.5)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
       
    }
    
}
