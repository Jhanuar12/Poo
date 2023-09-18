
package Figuras;

public class TrianguloRectangulo {
    int base;
    int altura;
        
    public TrianguloRectangulo(int base, int altura){
        this.base  = base;
        this.altura  = altura;
    }
    double calcularArea(){
        return(base*altura/2);
    }

    double calcularPerimetro(){
        return(base + altura + calcularHipotenusa());       
    }
    double calcularHipotenusa(){
        return Math.pow(base*base + altura*altura,0.5);
    }
    void determinarTipoTriangulo(){
        if ((base == altura)  && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero");
        
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triágulo escaleno");
        else
            System.out.println("Es un triángulo isósceles");
    }
    
    
}
