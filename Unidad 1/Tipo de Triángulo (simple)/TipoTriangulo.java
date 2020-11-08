
/**
 * Use los comentarios para explicar el objetivo de este programa TipoTriangulo .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (15/10/2020)
 */
public class TipoTriangulo
{
	/*	Lado 1 = a
		Lado 2 = b
		Lado 3 = c 		*/
    int a,b,c;
	/*	Equilatero = eq
		Isosceles = iso
		Escaleno = es 	*/
    boolean eq,iso,es;
    
    void algoritmo( ){
      
     eq = a==b && b==c ? true : false;   
     iso = (a==b && c!=a) || (a==c && b!=a) || (b==c && a!=b) ? true : false;   
     es =  a != b && a != c && c != b ? true : false;   
    
    
    }//fin method
    
}//fin class TipoTriangulo
