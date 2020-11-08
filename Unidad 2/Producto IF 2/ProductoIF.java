
/**
 * Use los comentarios para explicar el objetivo de este programa Producto .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (03/10/2020)
 */
public class ProductoIF
{
     /* Entradas

      Initial Amount = iAmount
   	  Purchased Amount = pAmount
      Quantity Sold = qSold
      Purchase price = pPrice
   */ 

   int iAmount;
   int pAmount;
   int qSold;
   int pPrice;
    
    /* Salidas

      Sale Price = sPrice
   	  Earnings = earn
      Expenses = expe
      Gross Profit = gProfit
      Taxes = taxes
      Net Earnings = netE
   */ 

    int sPrice;
    int earn;
    int expe;
    int gProfit;
    int taxes;
    int netE;

    void algoritmo( ){
      //precio de venta
     	sPrice = ((pPrice*29)/100)+pPrice;

      //ingresos
     	earn = sPrice*qSold;
     	
     	//egresos
     	expe = pPrice*pAmount;
     	
     	//ganacias brutas
     	gProfit = earn-expe;
     	
     	//Impuestos
     	taxes = (earn*19)/100;
     	
     	//Ganancias netos 
      
     	netE = gProfit-taxes; 
    
    }//fin method
    
}//fin class Producto
