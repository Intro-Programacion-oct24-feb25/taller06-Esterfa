/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

/**
 *
 * @author VEL-ANDRES
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
         int num1;
         int num2;
         int suma;
         int resta;
         int multiplicacion;
         double division;
         int potencia;
         
         System.out.print(¨Escriba el primer número: ¨)
         num1 = entrada.nextInt();
         
         System.out.print(¨Escriba el segundo número: ¨)
         num2 = entrada.nextInt();
         
         suma = num1 + num2;
         resta = num1 - num2;
         multiplicacion = num1*num2;
         division = num1/num2;
         
        if(num1 > num2){
        System.out.printIn(suma, resta, multiplicacion, division);
          }else if{(num1 < num2)
                  System.out.printIn(¨error¨)
                  }
        
    }
    
}
