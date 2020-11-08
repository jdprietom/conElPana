/**
 * Use los comentarios para explicar el objetivo de este programa Producto .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/10/2020)
 */

class Credito{


/*Entrada

Credit amount = cAmount
Interest Rate = iRate
Term of Months = tMonths
*/

 long cAmount;
 int iRate, tMonths;

/*Salidas

Monthly Fee Value = mFV
Monthly Capital Value = mCV
Monthly Value Interest = mVI
Total profit = totalP
*/  
 int mFV, mCV, mVI, totalP;


   void algoritmo(){

   	//Valor Mensual Interes
   		mVI = (int)(cAmount* iRate/100);

	//Valor Mensual Capital
   		mCV = (int)(cAmount/(long)tMonths);

	//Valor Cuota Mensual
   		mFV = mVI + mCV;
   		
	//porcentaje ganancia total
   		totalP = (int)((long)(mFV)*(long)(tMonths)*100/cAmount)- 100;
   		
   } 
}