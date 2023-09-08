import java.util.Scanner;
/*Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso. */
public class Ejercicio_15 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pa,pb,pc,pd; /*peso de las esferas A,B,C,D*/
    System.out.println("Ingrese el peso de la esfera A:");
    pa = input.nextInt();
    
    System.out.println("Ingrese el peso de la esfera B:");
    pb = input.nextInt();
    
    System.out.println("Ingrese el peso de la esfera C:");
    pc = input.nextInt();

    System.out.println("Ingrese el peso de la esfera D:");
    pd = input.nextInt();

        if (pa == pb && pa == pc) {
            /* D es la diferente */
            if (pd > pa) {
                System.out.println("D es la esfera diferente y la de mayor peso");
            } else {
                System.out.println("D es la esfera diferente y la de menor peso");
            }
        } else {
            if (pa == pb && pa == pd) {
                /* C es la diferente */
                if (pc > pa) {
                    System.out.println("C es la esfera diferente y la de mayor peso");
                } else {
                    System.out.println("C es la esfera diferente y la de menor peso");
                }
            } else {
                if (pa == pc && pa == pd) {
                    /* B es la diferente */
                    if (pb > pa) {
                        System.out.println("B es la esfera diferente y la de mayor peso");
                    } else {
                        System.out.println("B es la esfera diferente y la de menor peso");
                    }
                } else {
                    /* A es la diferente */
                    if (pa > pb && pa > pc && pa > pd) {
                        System.out.println("A es la esfera diferente y la de mayor peso");
                    } else {
                        System.out.println("A es la esfera diferente y la de menor peso");
            
            
            }
        
           
            
        }    

    }
    
}
input.close();
}
}