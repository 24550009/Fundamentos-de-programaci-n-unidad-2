/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_operdores;

/**
 *
 * @author artas
 */
public class EVA2_11_OPERDORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean hayDinero, hayBuenclima;
        
        //para hecer la carne asada se necesita
        //haya dinero y haya buen clima
        hayDinero=false;
        hayBuenclima=false;
        System.out.println("1:NO HAY DINERO Y  NO HAY BUEN CLIMA");
        if((hayDinero==true)&&(hayBuenclima==true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("BUEVITO CON CATSUP");
        
        
        hayDinero=false;
        hayBuenclima=true;
        System.out.println("2:NO HAY DINERO Y  HAY BUEN CLIMA");
        if((hayDinero==true)&&(hayBuenclima==true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("BUEVITO CON CATSUP");
        
        hayDinero=true;
        hayBuenclima=false;
        System.out.println("3:HAY DINERO Y  NO HAY BUEN CLIMA");
        if((hayDinero==true)&&(hayBuenclima==true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("BUEVITO CON CATSUP");
        
        hayDinero=true;
        hayBuenclima=true;
        System.out.println("4:HAY DINERO Y HAY BUEN CLIMA");
        if((hayDinero==true)&&(hayBuenclima==true))
            System.out.println("SE ARMO LA CARNITA!!");
        else
            System.out.println("BUEVITO CON CATSUP");
    }
    
}
