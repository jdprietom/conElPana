
/**
 * Use los comentarios para explicar el objetivo de este programa ExchangeHouseIF .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
public class ExchangeHouseIF
{
    /*Input
       Purchase Price = pPrice
       Sale Price = sPrice
       Initial Amount (Pesos) = iaPesos
       Initial Amount (Dollar) = iaDollar
       Dollar Amount Purchased = dollarAP
       Dollar Amount Sold = dollarAS      */
    
   double pPrice,sPrice,iaPesos,iaDollar,dollarAP,dollarAS;

   /*Output
   		Final Amount (Pesos) = finalP
   		Final Amount (Dollar) = finalD
   		Valid Information = validI         */

   double finalP, finalD;
   boolean 	validI;


   		void algoritmo(){

   			finalP = iaPesos+(sPrice*dollarAS)-(pPrice*dollarAP);
   			finalD = (iaDollar+dollarAP-dollarAS);
   			validI = finalP>0 && finalD>0 ? true : false;
    }//fin method
    
}//fin class ExchangeHouseIF
