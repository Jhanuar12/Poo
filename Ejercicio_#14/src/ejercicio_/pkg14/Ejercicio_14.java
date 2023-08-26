
package ejercicio_.pkg14;

import java.util.Scanner;

public class Ejercicio_14 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int num;
        System.out.println("Ingrese un numero:");
        
        num = input.nextInt();//Pide la entrada de un numero n
        
        double num_square = Math.pow(num,2);
       
        double num_cube = Math.pow(num,3);

        System.out.println("Su numero al cuadrado es: "+num_square+"\nSu numero al cubo es: "+num_cube);
       
    }
    
}
