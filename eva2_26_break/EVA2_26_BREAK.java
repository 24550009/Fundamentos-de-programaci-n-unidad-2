/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author artas
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario,pwd;
        
        String USUARIO="Admin";
        String PASWORD="Admin";
        
        Scanner captu=new Scanner(System.in);
        //como es un control de acceso,debemos preguntar un numero
        //numero indetreminado de veces, hasta que el usuario
        //y contraseña sean correctas
        while(true){//el while se detien cuando la condicion sea falsa
            System.out.println("USUARIO");
            usuario =captu.nextLine();
            System.out.println("CONTRASEÑA");
            pwd =captu.nextLine();
            if(usuario.equals(USUARIO)&& pwd.equals(PASWORD))
                break;
        }
        System.out.println("Bienvenidpo al sistema!!");
    }
    
}
