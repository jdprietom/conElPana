
/**
 * Use los comentarios para explicar el objetivo de este programa MainTR .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (30/10/2020)
 */
import java.util.Scanner;
public class MainTR
{
    public static void main (String args []){

    TwoRectangles tr = new TwoRectangles();

    Scanner sc = new Scanner(System.in);
    

    	System.out.println("Rectangulo 1 x1: ");
    		tr.x1 = sc.nextInt();
    	System.out.println("Rectangulo 1 y1: ");
    		tr.y1 = sc.nextInt();
    	System.out.println("Rectangulo 1 ancho: ");
    		tr.wid1 = sc.nextInt();
    	System.out.println("Rectangulo 1 alto: ");
    		tr.hei1 = sc.nextInt();
    	System.out.println("Rectangulo 2 x1: ");
    		tr.x2 = sc.nextInt();
    	System.out.println("Rectangulo 2 y1: ");
   	 		tr.y2 = sc.nextInt();
    	System.out.println("Rectangulo 2 ancho: ");
    		tr.wid2 = sc.nextInt();
   	 	System.out.println("Rectangulo 2 alto: ");
    		tr.hei2 = sc.nextInt();
    
    
    
    tr.algoritmo();
      
    	System.out.println("Puntos del Rectángulo 1: (" +tr.x1+ ", " +tr.y1+ "), (" +tr.xTopR+ ", " +tr.yTopR+ "), (" +tr.xLeft+ ", " +tr.yLeft+ "), (" +tr.xRight+ ", " +tr.yRight+ ")");
    	System.out.println("Puntos del Rectángulo 2: (" +tr.x2+ ", " +tr.y2+ "), (" +tr.xTopR2+ ", " +tr.yTopR2+ "), (" +tr.xLeft2+ ", " +tr.yLeft2+ "), (" +tr.xRight2+ ", " +tr.yRight2+ ")");
    	System.out.println("Rectángulos Interiores: " +tr.inside);
    	System.out.println("Rectángulos Exteriores: " +tr.outside);
    	System.out.println("Rectángulos Secantes: " +tr.sec);
    	System.out.println("Rectángulos Tangentes: " +tr.tan);
    
    }//fin method
    
}//fin class MainTR
