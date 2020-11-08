    /**
     * Use los comentarios para explicar el objetivo de este programa ServiciosPublicos .
     *
     * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
     * @version (27/10/2020)
     */
class ServiciosPublicos{
        
            /*Entrada
            Previous reading = pRead
            Current reading = cRead
            Monthly rate = mRate
            */
            int pRead, cRead, mRate;
    
            /*Salida
            Consumption = cons
            Water = water
            Cleanliness = clean
            Sewerage = sew
            total = total
            */
            int cons;
            float extra, aux, water, clean, sew, total;
            
    void algoritmo(){
        
            cons = cRead-pRead;
            extra = (float)(cons*mRate + (cons - 20)*0.25*mRate);
            aux = (float) cons * mRate;
            water = Math.max(extra,aux) ;
            clean = (float)(water * 0.10);
            sew = (float)(water * 0.15);
            total = (water+clean+sew);           

    }

}//fin class ServiciosPublicos