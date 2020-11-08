
/**
 * Use los comentarios para explicar el objetivo de este programa HoraValida .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (11/10/2020)
 */
public class HoraValida
{
    int hours, minutes, seconds;
    boolean valid;

   
    void algoritmo( ){
      	
      	valid = hours<24 && minutes<60 && seconds<60 ? true : false;

     	
    
    }//fin method
    
}//fin class HoraValida
