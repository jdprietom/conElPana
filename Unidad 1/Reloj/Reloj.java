
/**
 * Use los comentarios para explicar el objetivo de este programa Reloj .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (06/10/2020)
 */
public class Reloj{
  public static void main(String args[]){
    
      Consola c = new Consola();
    
        c.imprimir("Tiempo en Segundos (<= 86399 == 23:59:59) : ");
          
        
            int time;                    /*tambien pude igualar el c.leerEntero(); directamente aqui, 
                                            pero creo que asi se ve mas bonito y entendible el codigo */
            int hours, minutes, seconds;
            
            time = c.leerEntero(); 
            
            
            
            seconds = time % 60;
            minutes = (time /= 60) % 60;
            hours = (time /= 60) % 24;
           
            c.imprimir(hours+":"+minutes+":"+seconds);  
  
  }
}   
//fin class Reloj
