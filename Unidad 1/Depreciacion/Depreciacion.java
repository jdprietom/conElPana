
/**
 * Use los comentarios para explicar el objetivo de este programa Depreciacion .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (05/10/2020)
 */
public class Depreciacion{
  public static void main(String args[]){
    
      Consola c = new Consola();
    
      /*Entrada
         Total value to depreciate = total
         Monthly Value = mValue
         */
      int total, mValue;
      total = c.leerEntero("Valor total a depreciar: ");
      mValue = c.leerEntero("Valor mensual: ");
      
      /*Salida
          Years of Depreciation = yearsD
         */

      double yearsD = (double)total / (double)mValue;
      yearsD /= 12;
      
      
    c.imprimir("Años Depreciación: "+yearsD);
    
    /*en vez de c.imprimir me gusta usar mas "System.out.println"
      pero ya que tengo la consola, hay que darle uso xd
       */
  }
}   
//fin class Depreciacion
