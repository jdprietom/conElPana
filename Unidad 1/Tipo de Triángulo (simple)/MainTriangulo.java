
/**
 * Use los comentarios para explicar el objetivo de este programa MainTriangulo .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (15/10/2020)
 */
import java.util.Scanner;
public class MainTriangulo
{
   	public static void main(String[] args) {
   		
   	
   	TipoTriangulo tt = new TipoTriangulo();
   	Scanner sc = new Scanner(System.in);


   	System.out.println("Lado 1: ");
   		tt.a = sc.nextInt();
   	System.out.println("Lado 2: ");
   		tt.b = sc.nextInt();
   	System.out.println("Lado 3: ");
   		tt.c = sc.nextInt();


   	tt.algoritmo();
      
    System.out.println("Equilátero: "+tt.eq);
    System.out.println("Isósceles: "+tt.iso);
    System.out.println("Escaleno: "+tt.es);
    
    }//fin method
    
}//fin class MainTriangulo
