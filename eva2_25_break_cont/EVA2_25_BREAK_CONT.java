/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_break_cont;

/**
 *
 * @author artas
 */
public class EVA2_25_BREAK_CONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 100; i++) {
            //modulo % 1/2=1
            int mod=i%2;
            if(mod==1)//queremos los casos que sean pares !=0
                continue;//terminia la interacion actual, se devuelove al for 
                         //cuando se ejecuta, intrerrumpe la ieracion actual
            System.out.println(i);
            
        }
        System.out.println("break");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if(i==50)
                break;
        }
    }
    
}
