package ejercicio_7;

import java.util.Scanner;

public class Comparar {
    
        public static void main(String[] args) {
            int numa,numb;
            Scanner input = new Scanner(System.in);
            
            System.out.println("Ingrese el valor de A");
            numa = input.nextInt();
            
            System.out.println("Ingrese el valor de B");
            numb = input.nextInt();
            
            if (numa > numb){
                System.out.println("A es mayor que B");
            }
                else if (numa < numb){
                        System.out.println("A es menor que B");
                }
            else{
                System.out.println("A es igual a B");        
            }
        
        }
}
