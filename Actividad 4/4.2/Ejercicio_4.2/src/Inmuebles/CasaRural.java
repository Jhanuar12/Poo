package Inmuebles;
    
    public class CasaRural extends Casa {
        protected static double valorArea = 1500000;
        protected int distanciaCabera;
        protected int altitud;

        public CasaRural(int identificadorInmobiliario,int area, String direccion,
            int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabera, int altitud){
        
            super(identificadorInmobiliario, area, direccion,numeroHabitaciones, 
                  numeroBaños, numeroPisos);
            
            this.distanciaCabera = distanciaCabera;
            this.altitud  = altitud;
        }
        void imprimir(){
            super.imprimir(); 
            System.out.println("Distancia a cabecera municipal=" + distanciaCabera +  "km");/*Aqui en lugar de decir distanciaCabera decia numero de habitaciones
            supongo que sera un error en el pdf
            */
            System.out.println("Altitud sobre el nivel del mar = " +altitud + " metros");
            System.out.println();
        }
    }