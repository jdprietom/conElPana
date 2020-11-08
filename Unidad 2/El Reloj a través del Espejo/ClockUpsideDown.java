
/**
 * Use los comentarios para explicar el objetivo de este programa ClockUpsideDown .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (03/11/2020)
 */
public class ClockUpsideDown
{
    int time;
    int hours, minutes;

    int realTime;
    int realHours, realMinutes;
    
    void algoritmo( ){
    	
      int tempTime = time;
      hours = tempTime/100;
      minutes = tempTime%100;
      
      
      int tempHours = hours;
      minutes = (minutes == 0) ? 60 : minutes;
      hours = ((hours==11 && minutes != 60) || (hours==12)) ? 0 : hours;
      realTime = (12-hours)*100+(60-minutes);
      realTime = minutes <= 59 && tempHours!=11? realTime - 100: realTime;
      realHours = realTime/100;
      realMinutes = realTime%100;

    
    }//fin method
    
}//fin class ClockUpsideDown
