
/**
 * Use los comentarios para explicar el objetivo de este programa Horoscopo .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
public class Horoscopo2
{
    	long date;
        long day, month, year;

        String zodiacSign, chineseCalendar;

        boolean leapYear, feb, prove;
        
        boolean capricornio, acuario, piscis, aries, tauro, geminis, cancer, leo, virgo, libra, escorpio, sagitario;

		boolean dragon, serpiente, caballo, cabra, mono, gallo, perro, marrano, rata, bufalo, tigre, liebre;

    
    void algoritmo( ){
      
      	day = date%100;
        date = date/100;
        month = date%100;
        date = date/100;
        year = date%10000;
        

         	leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
         	feb = (day<=28 & day>=1) & (month==2) || (leapYear) & ((day<=29 & day>=1)  & month==2);
        
         	prove = ((day<=30 & day>=1) & (month==11 | month==4 | month==6 | month==9)) | ((day<=31 & day>=1) & (month==1 | month==3 | month==5 | month==7 | month==8 | month==10 | month==12)) | (feb);
        
         	capricornio = (day>=22 & month==12) | (day<=19 & month==1);
         	acuario = (day>=20 & month==1) | (day<=18 & month==2);
         	piscis = (day>=19 & month==2) | (day<=20 & month==3);
         	aries = (day>=21 & month==3) | (day<=19 & month==4);
         	tauro = (day>=20 & month==4) | (day<=20 & month==5);
         	geminis = (day>=21 & month==5) | (day<=20 & month==6);
         	cancer = (day>=21 & month==6) | (day<=22 & month==7);
         	leo = (day>=23 & month==7) | (day<=22 & month==8);
         	virgo = (day>=23 & month==8) | (day<=22 & month==9);
         	libra = (day>=23 & month==9) | (day<=22 & month==10);
         	escorpio = (day>=23 & month==10) | (day<=21 & month==11);
         	sagitario = (day>=22 & month==11) | (day<=21 & month==12);
        
         	dragon = year==1988 | year==2000 | year==2012;
         	serpiente = year==1989 | year==2001 | year==2013;
         	caballo = year==1990 | year==2002 | year==2014;
         	cabra = year==1991 | year==2003 | year==2015;
         	mono = year==1992 | year==2004 | year==2016;
         	gallo = year==1993 | year==2005 | year==2017;
         	perro = year==1994 | year==2006 | year==2018;
         	marrano = year==1995 | year==2007 | year==2019;
         	rata = year==1996 | year==2008 | year==2020;
         	bufalo = year==1997 | year==2009 | year==2021;
         	tigre = year==1998 | year==2010 | year==2022;
         	liebre = year==1999 | year==2011 | year==2023;

    
    }//fin method
    
}//fin class Horoscopo
