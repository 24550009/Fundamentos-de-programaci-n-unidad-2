/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author artas
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        //OPERADORES ARITMÉTICOS:
        //SUMA +,RESTA-, MULTIPLICACIÓN *, DIVICIÓN /
        int num1 ,num2;
        num1= 5;
        num2= 3;
        int suma = num1 + num2;//operador de suma+
        System.out.println("Las suma es: ");
        System.out.println(suma);
        //si ene l operdor + uno de los terminos es
        //una cadena todo see convierte a cadena y se unaen
        //concatenacion: union de cadenas de texto
        System.out.println("La sujam de 5 + 3 es: "+ suma);
        boolean prueba= true;
        System.out.println("El valor de prueba es : "+ prueba);
        // el simbnolo de resata solo resta numeros
        int multi;
        multi= num1 * num2;
        System.out.println("La multiplicacion es: " + multi);
        //divición/cudadao con los posibles resultados
        int divi= num1 / num2;
        System.out.println("La divicion de 5/3 es: "+divi);
        //java interpreta que tu quires una divicionn etera
        int divic = 7/2;
        System.out.println("la divicion es:" + divic);
        double diviDouble = 7/2.0;
        System.out.println("la divicion es:"+ diviDouble);
        //es necessario penrle . y algo cuando se quiera divicir con double
        double diviDouble1 = 7/2.0;
        System.out.println("la divicion es:"+ diviDouble1);
        //ACUMULADORES
        //SUMA +=, RESTAÑ=, MULTIPLICACION *=, DIVICION /=
        int sumatoria= 0;
       /* sumatoria=sumatoria + 90;
        sumatoria= sumatoria + 80;
        sumatoria= sumatoria + 80;*/
       sumatoria += 90;
       sumatoria += 80;
       sumatoria += 80;
        System.out.println("La sumatoria es: "+sumatoria);
        sumatoria-=70;
        //sumatoria = sumatoria - 70;
        System.out.println("la sumatoria es:"+ sumatoria);
        //
        int multiAcum= 1;
        multiAcum*=100;
        System.out.println("Multiacum = "+multiAcum);
        multiAcum *= 5;
        System.out.println("Multiacum =" +multiAcum);
        
        
          
    }
    
}
