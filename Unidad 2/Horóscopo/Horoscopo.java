
/**
 * Use los comentarios para explicar el objetivo de este programa Horoscopo .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (03/11/2020)
 */
public class Horoscopo
{
    	long date;
        long day, month, year;
        long animal;
        boolean leapYear, feb, prove;
        String zodiacSign,chineseYear;

    
    void algoritmo( ){
      
      	day = date%100;
        date = date/100;
        month = date%100;
        date = date/100;
        year = date%10000;

        animal = year%12;
        

         	leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
         	feb = (day<=28 & day>=1) & (month==2) || (leapYear) & ((day<=29 & day>=1)  & month==2);
        
         	prove = ((day<=30 & day>=1) & (month==11 | month==4 | month==6 | month==9)) | 
                  ((day<=31 & day>=1) & (month==1 | month==3 | month==5 | month==7 | month==8 | month==10 | month==12)) | (feb);

        
         	if((day>=22 & month==12) | (day<=19 & month==1))
            zodiacSign="Capricornio";
         	else if((day>=20 & month==1) | (day<=18 & month==2))
           zodiacSign="Acuario";
         	else if((day>=19 & month==2) | (day<=20 & month==3))
           zodiacSign="Piscis";
         	else if((day>=21 & month==3) | (day<=19 & month==4))
           zodiacSign="Aries";
         	else if((day>=20 & month==4) | (day<=20 & month==5))
           zodiacSign="Tauro";
         	else if((day>=21 & month==5) | (day<=20 & month==6))
           zodiacSign="Géminis";
         	else if((day>=21 & month==6) | (day<=22 & month==7))
           zodiacSign="Cáncer";
         	else if((day>=23 & month==7) | (day<=22 & month==8))
           zodiacSign="Leo";
         	else if((day>=23 & month==8) | (day<=22 & month==9))
           zodiacSign="Virgo";
         	else if((day>=23 & month==9) | (day<=22 & month==10))
           zodiacSign="Libra";
         	else if((day>=23 & month==10) | (day<=21 & month==11))
           zodiacSign="Escorpión";
         	else if((day>=22 & month==11) | (day<=21 & month==12))
           zodiacSign="Sagitario";

	        if(animal==8)   
               chineseYear = "Dragón";
          else if(animal==9)   
              chineseYear = "Serpiente";
         	else if(animal==10)   
              chineseYear = "Caballo";
         	else if(animal==11)     
              chineseYear = "Cabra";
          else if(animal==0)   
              chineseYear = "Mono";
         	else if(animal==1)   
              chineseYear = "Gallo";
         	else if(animal==2)   
              chineseYear = "Perro";
         	else if(animal==3)   
              chineseYear = "Marrano";
          else if(animal==4)   
              chineseYear = "Rata";
          else if(animal==5)   
              chineseYear = "Búfalo";
         	else if(animal==6)   
              chineseYear = "Tigre";
         	else if(animal==7)   
              chineseYear = "Liebre";
         

    }//fin method
    
}//fin class Horoscopo
