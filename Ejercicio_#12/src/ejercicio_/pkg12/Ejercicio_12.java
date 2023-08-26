package ejercicio_.pkg12;

public class Ejercicio_12 {
      
    public static void main(String[] args) {
        float salario_bruto = 48*5000f; /* variable que toma el salario bruto del
        trabajador para luego tomar la retención y el salario neto*/
        double retencion = ((salario_bruto*12.5)/100);//retencion

        double neto = (salario_bruto - retencion);//salario neto
        
        System.out.println("El salario bruto del trabajdor es "+salario_bruto+"\nLa retencion es " +retencion+"\nEl salario neto es "+neto);
    }
    
}
