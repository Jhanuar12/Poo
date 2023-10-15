package CarreraCiclistica;
    
    public class Escalador extends Ciclista {
        private double aceleraccionPromedio;
        private double gradoRampa;
        
        public Escalador(int identificador, String nombre, double
        aceleracionPromedio, double gradoRampa){

            super(identificador,nombre);
            this.aceleraccionPromedio = aceleraccionPromedio;
            this.gradoRampa = gradoRampa;
            }
        
        protected double getAceleracionPromedio(){
            return aceleraccionPromedio;
        }
    
        protected void setaAceleraccionPromedio(double aceleraccionPromedio){
            this.aceleraccionPromedio = aceleraccionPromedio;
        }
    
        protected double getGradoRampa(){
            return gradoRampa;
        }
        
        protected void setGradoRampa(double gradoRampa){
            this.gradoRampa = gradoRampa;
        }
        
        protected void imprimir(){
            super.imprimir();
            System.out.println("Aceleracion promedio= "+ aceleraccionPromedio);
            System.out.println("Grado de rampa= " + gradoRampa);
        
        }
    
        protected String imprimirTipo(){
            return "Es un escalador";
        }
    }
