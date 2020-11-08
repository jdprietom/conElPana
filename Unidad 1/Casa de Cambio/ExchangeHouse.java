
/**
 * Use los comentarios para explicar el objetivo de este programa ExchangeHouse .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
public class ExchangeHouse
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

   	}
   
    
}//fin class ExchangeHouse
