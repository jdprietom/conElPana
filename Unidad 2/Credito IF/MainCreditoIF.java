 /**
 * Use los comentarios para explicar el objetivo de este programa Producto .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (26/10/2020)
 */

 class MainCreditoIF
{
  public static void main(String args[]){
    
    CreditoIF cr = new CreditoIF();

    Consola c = new Consola();

        cr.cAmount = c.leerLong("Monto del Credito");
        cr.iRate = c.leerEntero("Tasa de Interes");
        cr.tMonths = c.leerEntero("Plazo en Meses");

    cr.algoritmo();

        if (cr.cAmount<0 || cr.iRate<0 || cr.tMonths<0) {

            c.imprimir("Error, los siguientes datos son negativos:");
            
            if(cr.cAmount<0){    
                c.imprimir("Monto.");
            }
            if(cr.iRate<0){
                c.imprimir("Tasa de Interés.");
            }
            if(cr.tMonths<0){
                c.imprimir("Plazo en meses.");
            }                   
        }
            else{
            
            if (cr.iRate>35){
                c.imprimir("Error, la tasa de interés supera el umbral de usura.");
                
            }   
        
            else{

                c.imprimir("Valor Cuota Mensual = " + cr.mFV);
                c.imprimir("Valor Mensual Capital = " + cr.mCV);        
                c.imprimir("Valor Mensual Interes = " + cr.mVI);
                c.imprimir("Ganancia Total = " + cr.totalP + "%");

            }
        }
    }
}