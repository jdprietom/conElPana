
/**
 * Use los comentarios para explicar el objetivo de este programa HorseMove .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
public class HorseMove
{
     /*  	Initial Column = iC
            Initial row = iR
            Final Column = fC
            Final Row  = fR 		*/
        char iC, fC;
        int iR, fR;

        boolean letters1, letters2, num1, num2;

        boolean move1, move2, move3, move4, move5, move6, move7, move8;
    
    void algoritmo( ){
      
         letters1 = iC >= 97 && iC <= 104;
         letters2 = fC >= 97 && fC <= 104;
         num1 = iR>=1 && iR<=8;
         num2 = fR>=1 && fR<=8;
        

         	move1 = (iR+2==fR) & (iC+1==fC);
         	move2 = (iR+1==fR) & (iC+2==fC);
         	move3 = (iR-1==fR) & (iC+2==fC);
         	move4 = (iR-2==fR) & (iC+1==fC);
         	move5 = (iR-2==fR) & (iC-1==fC);
         	move6 = (iR-1==fR) & (iC-2==fC);
         	move7 = (iR+1==fR) & (iC-2==fC);
         	move8 = (iR+2==fR) & (iC-1==fC);
    
    }//fin method
    
}//fin class HorseMove
