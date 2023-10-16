/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animals;

/**
 *
 * @author Matte
 */
public class Ejer47_Prueba {

    public static void main(String[] args) {
        Animal[] animales = new Animal[4]; 
        
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        
            for (int i = 0; i < animales.length; i++) { 
                System.out.println("Nombre cientifico: "+animales[i].getNombreCientifico());
                System.out.println("Sonido: " + animales[i].getSonido());        
                System.out.println("Alimentos: " + animales[i].getAlimentos());
                System.out.println("Hábitat: "+animales[i].getHabitat());
                System.out.println();
            }
        
    }
    
}
