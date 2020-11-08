
/**
 * Use los comentarios para explicar el objetivo de este programa MainCir .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (15/10/2020)
 */
import java.util.Scanner;
public class MainCir{
	public static void main(String[] args) {
	
    Circunferencia c = new Circunferencia();
	
	Scanner sc = new Scanner(System.in);

    System.out.println("Coordenada X del centro: ");
        c.midX = sc.nextDouble();
    System.out.println("Coordenada Y del centro: ");
        c.midY = sc.nextDouble();
    System.out.println("Radio: ");
        c.r = sc.nextDouble();
    System.out.println("Coordenada X del punto: ");
        c.dotX = sc.nextDouble(); 
    System.out.println("Coordenada Y del punto: ");
        c.dotY = sc.nextDouble();

    c.algoritmo();
      
    
        System.out.println("Punto Dentro    : "+c.pIn);
        System.out.println("Punto Fuera     : "+c.pOut);
        System.out.println("Punto En Borde  : "+c.pEdge);

    }//fin method
    
}//fin class MainCir
