
/**
 * Use los comentarios para explicar el objetivo de este programa MainCuadrantes .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (19/10/2020)
 */
import java.util.Scanner;
public class MainCuadrantes
{
    public static void main(String[] args) {
    	
    	Cuadrantes c = new Cuadrantes();
    	Scanner sc = new Scanner(System.in);


    	System.out.println("Coordenada X del primer punto: ");
    		c.x1p = sc.nextDouble();    
    	System.out.println("Coordenada Y del primer punto: ");
    		c.y1p = sc.nextDouble();    
    	System.out.println("Coordenada X del segundo punto: ");
    		c.x2p = sc.nextDouble();    
    	System.out.println("Coordenada Y del segundo punto: ");
    		c.y2p = sc.nextDouble();    
    

    c.algoritmo();


    	System.out.println("Primer Cuadrante  : "+c.q1t);
    	System.out.println("Segundo Cuadrante : "+c.q2t);
    	System.out.println("Tercer Cuadrante  : "+c.q3t);
    	System.out.println("Cuarto Cuadrante  : "+c.q4t);
    	System.out.println("Un Cuadrante      : "+c.oneQ);
    	System.out.println("Dos Cuadrantes    : "+c.twoQ);
    	System.out.println("Tres Cuadrantes   : "+c.threeQ);

      
      
    
    }//fin method
    
}//fin class MainCuadrantes
