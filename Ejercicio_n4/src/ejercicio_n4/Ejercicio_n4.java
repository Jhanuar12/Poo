package ejercicio_n4;
import java.util.Scanner;
public class Ejercicio_n4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        short edjuan;       
        System.out.println("Ingrese la edad de Juan: ");    
        edjuan = input.nextShort();//ed es edad.  
        short edalberto = (short) ((edjuan*2)/3); //Toma la edad de Juan y la multiplica por 2/3.Usare short debido a su facilidad,    
        short edana = (short) ((edjuan*4)/3);//Toma la edad de Juan y la multiplica por 4/3.        
        short edmama = (short) (edjuan+edalberto+edana);/*Variable que toma todas las edades anteriories y las suma 
        la verdad no se si deberia usar float, en caso de alguno numero intermedio, cuando edjuan == 11
        edalberto == 7,3..., lo que podria afectar edmama. Dejare short que redondea al numero mas cercano a la izquierda.             
        */
        System.out.println("La edad de Juan es " + edjuan + "\nLa edad de Alberto es "+ edalberto + "\nLa edad de Ana es " + edana + " \nLa edad de su Madre es " +edmama );
    }
}
