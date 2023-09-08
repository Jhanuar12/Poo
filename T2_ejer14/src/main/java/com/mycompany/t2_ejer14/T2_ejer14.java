/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t2_ejer14;

/**
 *
 * @author Matteo Cordero M
 */
import java.util.Scanner;
public class T2_ejer14 {

    public static void main(String[] args) {
        float VD1;
        float VD2;
        float VD3;
        float Salario;
        float Total_ventas;
        double Porcent_ventas;
        double Salario1;
        double Salario2;
        double Salario3;
        //Captura de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ventas del departamento 1: ");
        VD1 = entrada.nextFloat();
        System.out.println("Ventas del departamento 2:");
        VD2 = entrada.nextFloat();
        System.out.println("Ventas del departamento 3");
        VD3 = entrada.nextFloat();
        System.out.println("Salario base: ");
        Salario = entrada.nextFloat();
        Total_ventas = VD1 + VD2 + VD3;
        Porcent_ventas = 0.33*Total_ventas;
        Salario1 = 0;
        Salario2 = 0;
        Salario3 = 0;
        
        //Inicio de los condicionales
        if (VD1 > Porcent_ventas){
            Salario1 = Salario + 0.2*Salario;
        }
        
        else{
            Salario1 =Salario;
        }
        
        if (VD2 > Porcent_ventas){
            Salario2 = Salario + 0.2*Salario;           
        }
        
        else{
            Salario2 = Salario;
        }
        
        if (VD3 > Porcent_ventas){
            Salario3 = Salario + 0.2*Salario;
        }
        
        else{
            Salario3 = Salario;
        }
        
        System.out.println("Salario ventas Dpto 1: "+ Salario1);
        System.out.println("Salario ventas Dpto 2: "+ Salario2);
        System.out.println("Salario ventas Dpto 3: "+ Salario3);

        
    }
}
