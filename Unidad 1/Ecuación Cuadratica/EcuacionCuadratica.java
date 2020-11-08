
/**
 * Use los comentarios para explicar el objetivo de este programa EcuacionCuadratica .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (12/10/2020)
 */
public class EcuacionCuadratica
{
    int a = 0; 
    int b = 0; 
    int c = 0; 

/* Discriminante = d
   Concavidad hacia arriba = up 
   Concavidad hacia abajo = down
   No hay soluciones = e
   Hay una solución = f
   Hay 2 soluciones = g
*/

    double d;
    boolean e,f,g,up,down;

    
    void algoritmo(){
      
      up = a>0 ? true : false;
      down = a<0 ? true : false;
      d = Math.pow(b,2)-(4*a*c);
      
      g = d>0 ? true : false;
      e = d<0 ? true : false;
      f = d==0  ? true : false;

    
    }//fin method
    
}//fin class EcuacionCuadratica
