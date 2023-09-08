import java.util.Scanner;

/*Programa para encontrar las x de una ecuación cuadratica*/

public class ejercicio_23  {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double a,b,c;

        System.out.println("Ingrese el valor de A:");
        a = input.nextDouble();
        System.out.println("Ingrese el valor de B:");
        b = input.nextDouble();
        System.out.println("Ingrese el valor de C:");
        c = input.nextDouble();/*Variables de la ecuación*/

        double discriminante = Math.pow(b,2) - 4*a*c;

        if (discriminante < 0) {
            System.out.println("No existen soluciones en los reales.");      
        }
        else {
            double x1 = (-b + Math.sqrt(discriminante))/(2*a);
            double x2 = (-b - Math.sqrt(discriminante))/(2*a);
            if (x1==x2 && discriminante == 0) {
                System.out.println(x1+"\n"+"Tiene una única solucion");    
            }
            else{ 
                System.out.println("Las x son"+x1+" y "+x2);
            
            }

        }

        input.close();
    }
  

}   