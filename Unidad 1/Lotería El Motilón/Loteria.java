
/**
 * Use los comentarios para explicar el objetivo de este programa Loteria .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (16/10/2020)
 */
public class Loteria
{
/* 	winnig number = win
		bet number = bet
		bet full = betF
		bet full invested = betI
		bet to leg = betP

	*/
    int win, bet;
    int betF, betI, betL;
  /*  won full = won
		won full invested = wonI
		won leg = wonL				*/
    boolean won, wonI, wonL;
    /* 	Value won full = valueW
    	Value won full invested = valueI
    	Value won leg = valueL
    	Value won total = total	    */
    long valueW, valueI, valueL, total;
  
  public int invertir(int number){
    int invertido = 0;
    number*=10;
    invertido += (number/=10)%10 * 1000;
    invertido += (number/=10)%10 * 100;
    invertido += (number/=10)%10 * 10;
    invertido += (number/=10);
    return invertido;
  }
  public void algoritmo(){
      won = win == bet;
      wonI = invertir(win) == bet;
      wonL = win % 100 == bet % 100;
    	valueW = betF*5000;
    	valueI = betI*2500;
    	valueL = betL*1000;
    	total = valueW + valueI + valueL;
  }
 
}