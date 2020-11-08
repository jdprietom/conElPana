/**
 * Use los comentarios para explicar el objetivo de este programa MainSP .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (27/10/2020)
 */
public class MainSpIF
{
    public static void main(String[] args) {
            
        ServiciosPublicosIF sp = new ServiciosPublicosIF();
        
        Consola c = new Consola();
        
            sp.pRead = c.leerEntero("Lectura Anterior: ");
            sp.cRead = c.leerEntero("Lectura Actual: ");
            sp.mRate = c.leerEntero("Tarifa Mensual: ");
    
            sp.algoritmo();

        if (sp.pRead<0 || sp.cRead<0 || sp.mRate<0) {

            c.imprimir("Error, los siguientes datos son negativos:");
            
            if(sp.pRead<0){    
                c.imprimir("Lectura Anterior.");
            }
            if(sp.cRead<0){
                c.imprimir("Lectura Actual.");
            }
            if(sp.mRate<0){
                c.imprimir("Tarifa Mensual.");
            }
        }

            else {
                if(sp.pRead<=sp.cRead){

                sp.algoritmo();

                c.imprimir("Consumo: " + sp.cons);
                c.imprimir("Agua: " + sp.water);
                c.imprimir("Aseo: " + sp.clean);
                c.imprimir("Alcantarillado: " + sp.sew);
                c.imprimir("Total: " + sp.total);
                    
                }
            
            else {
  
                sp.water = (sp.mRate*30);
                sp.clean = (float)(sp.water * 0.10);
                sp.sew = (float)(sp.water * 0.15);
                sp.total = (sp.water+sp.clean+sp.sew);  

                c.imprimir("Consumo Inconsistente. Se cobra Tarifa Plena");

                c.imprimir("Agua: " + sp.water);
                c.imprimir("Aseo: " + sp.clean);
                c.imprimir("Alcantarillado: " + sp.sew);
                c.imprimir("Total: " + sp.total);
            }
        }
   }//fin method    
}//fin class MainSP
