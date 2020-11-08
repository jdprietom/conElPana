
/**
 * Use los comentarios para explicar el objetivo de este programa Reloj .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (07/10/2020)
 */
public class RelojInvertido{
  public static void main(String args[]){
    
      Consola c = new Consola();
              
        int hours, minutes, seconds;
        int total;


          hours = c.leerEntero("Horas (hh24 de 0 a 23): ");

          minutes = c.leerEntero("Minutos (mm de 0 a 59): ");

          seconds = c.leerEntero("Segundos (ss de 0 a 59): ");  
              

          total = ((hours*3600)+(minutes*60)+seconds);          
           
          c.imprimir("Tiempo Total en Segundos: " + total);  
  
  }
}   
//fin class RelojInvertido