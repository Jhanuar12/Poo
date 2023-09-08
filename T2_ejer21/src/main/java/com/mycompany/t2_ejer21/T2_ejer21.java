/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t2_ejer21;

/**
 *
 * @author Matteo Cordero M
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class T2_ejer21 {

    public static void main(String[] args) {
        float L1;
        float L2;
        float L3;
        double area;
        double perimetro;
        double semiperimetro;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Ingrese el lado 1: ");
        L1 = entrada.nextFloat();
        System.out.println("Ingrese el lado 2: ");
        L2 = entrada.nextFloat();
        System.out.println("Ingrese el lado 3: ");
        L3 = entrada.nextFloat();
        perimetro = L1 + L2 + L3;
        semiperimetro = perimetro/2;
        area = Math.sqrt(semiperimetro*(semiperimetro-L1)*(semiperimetro-L2)*(semiperimetro-L3));
        
        System.out.println("El area del triangulo es: "+df.format(area)+" u^2");
        System.out.println("El perimetro del triangulo es: "+perimetro+" u");
        System.out.println("El semiperimetro del triangulo es: "+semiperimetro+" u");
    }
}
