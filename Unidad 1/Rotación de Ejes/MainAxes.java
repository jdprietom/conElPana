
/**
 * Use los comentarios para explicar el objetivo de este programa MainAxes .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
import java.util.Scanner;
public class MainAxes
{
    public static void main(String[] args) {

    	RotationAxes ra = new RotationAxes();

    	Scanner sc = new Scanner(System.in);


    		System.out.println("x1: ");
    			ra.x1 = sc.nextDouble();
    		System.out.println("y1: ");
        		ra.y1 = sc.nextDouble();
    		System.out.println("x2: ");
        		ra.x2 = sc.nextDouble();
    		System.out.println("y2: ");
        		ra.y2 = sc.nextDouble();
    		System.out.println("x3: ");
        		ra.x3 = sc.nextDouble();
    		System.out.println("y3: ");
        		ra.y3 = sc.nextDouble();
    		System.out.println("x4: ");
        		ra.x4 = sc.nextDouble();
    		System.out.println("y4: ");
        		ra.y4 = sc.nextDouble();
    	

    ra.algoritmo();
      
      	System.out.println("output=Puntos del Rectángulo Rotado:");
        System.out.println( "("+Math.round(ra.xp1) +","+ Math.round(ra.yp1)+")," );
        System.out.println( "("+Math.round(ra.xp2) +","+ Math.round(ra.yp2)+")," );
        System.out.println( "("+Math.round(ra.xp3) +","+ Math.round(ra.yp3)+")," );
        System.out.println( "("+Math.round(ra.xp4) +","+ Math.round(ra.yp4)+")" );
        System.out.println( "Ángulo de Rotación: " + Math.round(ra.deg) );
    
    }//fin method
    
}//fin class MainAxes
