import java.util.Scanner;

public class PruebaCuenta {
    
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Cuenta de ahorros");
        System.out.println("Ingrese saldo inicial  = $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.println("Ingerese tasa de interés=");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuenta1 = new
            CuentaAhorros(saldoInicialAhorros,tasaAhorros);
        System.out.println("Ingresar cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        cuenta1.consignar(cantidadDepositar);
        System.out.println("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        cuenta1.retirar(cantidadRetirar);
        cuenta1.extractoMensual();
        cuenta1.imprimir();
    }
}
