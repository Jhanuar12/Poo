
package ejercicicio_n5;


public class Ejercicicio_n5 {

    public static void main(String[] args) {
        double suma = 0;
        double x = 20;
        suma =  x + suma ;
        double y = 40;
        x = x + Math.pow(y,2);
        suma = suma + x/y;
        System.out.println("El valor de suma es "+suma);
        //java da mucho problema con exponentes.               
    }
    
}
