
/**
 * Use los comentarios para explicar el objetivo de este programa MainSP .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (27/10/2020)
 */
public class MainSP
{
    public static void main(String[] args) {
            
        ServiciosPublicos sp = new ServiciosPublicos();
        
        Consola c = new Consola();
        
            sp.pRead = c.leerEntero("Lectura Anterior: ");
            sp.cRead = c.leerEntero("Lectura Actual: ");
            sp.mRate = c.leerEntero("Tarifa Mensual: ");
    
            sp.algoritmo();
      
                c.imprimir("Consumo: " + sp.cons);
                c.imprimir("Agua: " + sp.water);
                c.imprimir("Aseo: " + sp.clean);
                c.imprimir("Alcantarillado: " + sp.sew);
                c.imprimir("Total: " + sp.total);
    
   }//fin method
    
}//fin class MainSP
