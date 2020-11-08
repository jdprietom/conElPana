
/**
 * Use los comentarios para explicar el objetivo de este programa MainRec .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (18/10/2020)
 */
import java.util.Scanner;
public class MainRec
{
   	public static void main(String[] args) {
   		
   	Rectangulo r = new Rectangulo();

   	Scanner sc = new Scanner(System.in);


   	System.out.println("Coordenada X esquina: ");
      r.xTopL = sc.nextDouble();  
   	System.out.println("Coordenada Y esquina: ");
      r.yTopL = sc.nextDouble();
   	System.out.println("Ancho: ");
      r.wid = sc.nextDouble();  
   	System.out.println("Alto: ");
      r.hei = sc.nextDouble();     
   	System.out.println("Coordenada X del punto: ");
      r.xP = sc.nextDouble();  
   	System.out.println("Coordenada Y del punto: ");
      r.yP = sc.nextDouble();  

    
    r.algoritmo();
      
      System.out.println("Punto Dentro             : "+r.pIn);
      System.out.println("Punto Fuera              : "+r.pOut);
      System.out.println("Punto En Borde Superior  : "+r.pTop);
      System.out.println("Punto En Borde Inferior  : "+r.pBot);
      System.out.println("Punto En Borde Izquierdo : "+r.pLeft);
      System.out.println("Punto En Borde Derecho   : "+r.pRight);

    
    }//fin method
    
}//fin class MainRec
