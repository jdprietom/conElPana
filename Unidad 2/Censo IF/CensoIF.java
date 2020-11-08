
/**
 * Use los comentarios para explicar el objetivo de este programa Censo .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
public class CensoIF
{
    /* 	Age = age
		height = hei
		weight = wei  */
    double age,hei,wei;

    /*	Age out of range = ageOut
    	height out of range = heiOut
    	weight out of range = weiOut
    	young = young
    	adult = adult
    	old man = old
    	height(short) = hShort
    	height(average) = hAvg
    	height(tall) = hTall
    	weight(low) = wLow
    	weight(average) = wAvg
    	weight(high) = wHigh   		*/

    boolean ageOut, heiOut, weiOut, young, adult, old, hShort, hAvg, hTall, wLow, wAvg, wHigh;

    void algoritmo( ){
     
     	ageOut = age>=16 && age<=50 ? false : true; 
  		heiOut = hei>=1 && hei<=(1.8) ? false : true;
     	weiOut = wei>=40 && wei<=100 ? false : true;
     	young = age>=16 && age<=25 ? true : false; 
     	adult = age>25 && age<=40 ? true : false;
     	old = age>40 && age<=50 ? true : false;
     	hShort = hei>=1 && hei<=(1.6) ? true : false;
     	hAvg = hei>(1.6) && hei<=(1.7) ? true : false;
     	hTall = hei>(1.7) && hei<=(1.8) ? true : false;
     	wLow = wei>=40 && wei<=60 ? true : false;
     	wAvg = wei>60 && wei<=80 ? true : false;
     	wHigh = wei>80 && wei<=100 ? true : false;
  
    }//fin method
    
}//fin class Censo
