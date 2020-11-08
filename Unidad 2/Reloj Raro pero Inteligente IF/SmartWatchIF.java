
/**
 * Use los comentarios para explicar el objetivo de este programa SmartWatch .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
public class SmartWatchIF
{
   	/* 	Numero = num
		Hours = h
		Minutes = m
		Seconds = s			*/
	int num;

	int h, m, s;

	// Entrada de dato char = in
	char in; 
	char midNight, early, morning, noon, afternoon, night;

	/*	Morning and Night = outMN
		Early and Afternoon = outEA
		Noon and MidNight = outNM 		
		Boolean Output = out		*/
	boolean outMN, outEA, outNM, out; 

    
    void algoritmo(){
      
    	midNight = 'm';
    	early = 'e';
    	morning = 'M';
    	noon = 'n';
    	afternoon = 'a';
    	night = 'N';

    	s = num%100;
    	m = (num/100)%100;
    	h = (num/100)/100%100;


    	outMN = ((h<=11 & h>=6 & m<=59 & s<=59) & (morning==in | night==in));
    	outEA = ((h<=5 & h>=1 & m<=59 & s<=59) & (early==in | afternoon==in));
    	outNM = (h<=12 & m<=59 & s<=59) & ((h==12 & m<=59 & s<=59) & ((noon==in) | (midNight==in))); 

    	out = outMN | outEA | outNM; 

    }//fin method
    
}//fin class SmartWatch
