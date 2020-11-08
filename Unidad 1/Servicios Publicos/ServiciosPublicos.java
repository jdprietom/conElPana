    
    /**
     * Use los comentarios para explicar el objetivo de este programa ServiciosPublicos .
     *
     * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
     * @version (05/10/2020)
     */
    public class ServiciosPublicos{
        public static void main(String[] args) {
            
            Consola c = new Consola();
    /*Entrada
            Previous reading = pRead
            Current reading = cRead
            Monthly rate = mRate
    */
            int pRead, cRead, mRate;
    
            pRead = c.leerEntero("Lectura Anterior: ");
            cRead = c.leerEntero("Lectura Actual: ");
            mRate = c.leerEntero("Tarifa Mensual: ");
    
    /*Salida
            Consumption = cons
            Water = water
            Cleanliness = clean
            Sewerage = sew
            total = total
             */
    
            int cons = cRead-pRead;
            float extra = (float)(cons*mRate + (cons - 20)*0.25*mRate);
            float aux = (float) cons * mRate;
            float water = Math.max(extra,aux) ;
            float clean = (float)(water * 0.10);
            float sew = (float)(water * 0.15);
            float total = (water+clean+sew);
            
                c.imprimir("Consumo: " + cons);
                c.imprimir("Agua: " + water);
                c.imprimir("Aseo: " + clean);
                c.imprimir("Alcantarillado: " + sew);
                c.imprimir("Total: " + total);

    }

}//fin class ServiciosPublicos