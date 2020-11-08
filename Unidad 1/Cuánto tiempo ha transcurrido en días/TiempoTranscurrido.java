
/**
 * Use los comentarios para explicar el objetivo de este programa TiempoTranscurrido .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */

public class TiempoTranscurrido
{
    
    /*  Number = num
        Hour = h
        Minutes = m     */
    long num, h, m;

    /*  "In this code, I work with the first 6 and last 6 digits" 
        first = First 6 digits
        last = Last 6 digits
        h1 = hour 1      -  h2 = hour 2
        m1 = minutes 1   -  m2 = minutes 2
        s1 = seconds 1   -  s2 = seconds 2                          */
    long first, last, h1, m1, s1, h2, m2, s2;

    //second = sec
    float sec1, sec2;

    double one, two;



    void algoritmo() {


    	h = 3600;
    	m = 60;


    	last = num%1000000;
    	h2 = last%100;
    	last = last/100;
    	m2 = last%100;
    	last = last/100;
    	s2 = last%100;

    	num = num/1000000;
    	first = num%1000000;
    	h1 = first%100;
    	first = first/100;
    	m1 = first%100;
    	first = first/100;
    	s1 = first%100;

    	sec1 = (h1*h)+(m1*m)+(s1);
    	sec2 = (h2*h)+(m2*m)+(s2);
    
    	
    
    	one = sec2-sec1;
    	two = one/86400;

   }//fin method
    
}//fin class TiempoTranscurrido
