 /**
 * Use los comentarios para explicar el objetivo de este programa Producto .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/10/2020)
 */

 class MainCredito
{
  public static void main(String args[]){
    
    Credito cr = new Credito();

    Consola c = new Consola();

    	cr.cAmount = c.leerLong("Monto del Credito");
    	cr.iRate = c.leerEntero("Tasa de Interes");
    	cr.tMonths = c.leerEntero("Plazo en Meses");



    cr.algoritmo();

    	c.imprimir("Valor Cuota Mensual = " + cr.mFV);
        c.imprimir("Valor Mensual Capital = " + cr.mCV);        
        c.imprimir("Valor Mensual Interes = " + cr.mVI);
        c.imprimir("Ganancia Total = " + cr.totalP + "%");


 	}
}