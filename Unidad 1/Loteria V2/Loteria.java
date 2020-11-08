public class Loteria 
{
	/* 	winnig number = win
		bet number = bet
		bet full = betF
		bet full invested = betI
		bet to leg = betL			*/
    String win, bet;
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
    
    public String invertir(String number){

    	String invertido = "";

    		invertido += number.charAt(3);
    		invertido += number.charAt(2);
    		invertido += number.charAt(1);
    		invertido += number.charAt(0);
   	 		return invertido;
	}

    void algoritmo( ){
      

    	won = win.equals(bet);
      	wonI = invertir(String.valueOf(win)).equals(String.valueOf(bet));
      	wonL = win.substring(2,4).equals(bet.substring(2,4));
    	valueW = betF*5000;
    	valueI = betI*2500;
    	valueL = betL*1000;
    	total = valueW + valueI + valueL;

    }//fin method
    
}//fin class Loteria

