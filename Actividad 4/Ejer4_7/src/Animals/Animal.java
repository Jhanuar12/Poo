/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

/**
 *
 * @author Matte
 */
public abstract class Animal {
    protected String sonido; 
    protected String alimentos; 
    protected String habitat; 
    protected String nombreCientifico; 

    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
    

}
