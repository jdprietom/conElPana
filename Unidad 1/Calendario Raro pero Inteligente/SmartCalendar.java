
/**
 * Use los comentarios para explicar el objetivo de este programa SmartCalendar .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (22/10/2020)
 */
public class SmartCalendar
{

	/*	Number = n
	 	Years = y
		Month = m
		Day = d 	*/

	int num, y, m, d;

	/*	Rare Year = rY
		First Digit Year = fY    	|	fY First Digit (Unidades) = y1    	|  	fY Second Digit (Decenas) = y11 
		Second Digit year = sY 		| 	sY First Digit (Centenas) = y2 	  	| 	sY Second Digit (Miles)   = y22	
		Month (ASCII Digit 1) = m1
		Month (ASCII Digit 2) = m2
		Day (ASCII Digit 1) = d1
		Day (ASCII Digit 2) = d2	
	*/
	int rY, fY, y1, y11, sY, y2, y22, m1, m2, d1, d2;

	/* 	Ecuación = (x + 48)
  
    	0 = 48   |  1 = 49    |  2 = 50    |  3 = 51    |  4 = 52
		5 = 53   |  6 = 54    |  7 = 55    |  8 = 56    |  9 = 57

		Ecuacion Dia = x1, x2
		Ecuacion Mes = x3, x4 		*/
	int x1, x2, x3, x4;

    
    void algoritmo(){
      
    	
      	y = num%10000;
      	m = (num/10000)%100;
      	d = (num/10000)/100%100;

      	rY = 9999-y;
      	fY = rY%100;
      	sY = rY/100;
      	y1 = fY%10;
      	y11 = fY/10;
      	y2 = sY%10;
      	y22 = sY/10;

      	m1 = m/10;
      	m2 = m%10;

      	d1 = d/10;
      	d2 = d%10;

      	x1 = d1 + 48;
      	x2 = d2 + 48;
      	x3 = m1 + 48;
      	x4 = m2 + 48;
         
    }//fin method
    
}//fin class SmartCalendar
