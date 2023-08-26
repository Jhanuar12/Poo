package ejercicio_.pkg17;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radio;
        
        System.out.println("Ingrese el radio: ");
        
        radio = input.nextInt();//Linea que pide el radio.
        
        double area = (Math.PI*(Math.pow(radio,2))); 
        
        double perimetro = (Math.PI*(radio*2));
        
        System.out.println("El area de su circulo es : "+area+"\nEl perimetro de su circulo es: "+perimetro);
    }
    
}
