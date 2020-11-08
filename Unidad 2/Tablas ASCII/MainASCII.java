
/**
 * Use los comentarios para explicar el objetivo de este programa MainASCII .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (01/11/2020)
 */
import java.util.Scanner;
public class MainASCII
{
	public static void main(String[] args) {
		
    ASCII a = new ASCII();
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Caracter:");
    a.symbol = sc.next().charAt(0);

    a.algoritmo();
      
      if (a.digit) {
      	System.out.println("1=Dígito");
      }
      if (a.mayus) {
      	System.out.println("2=Alfabético Consonante MAYÚSCULA");
      }
      if (a.minus) {
      	System.out.println("3=Alfabético Consonante minúscula");
      }
      if (a.vocalMayus) {
      	System.out.println("4=Alfabético Vocal MAYÚSCULA");
      }
      if (a.vocalMinus) {
      	System.out.println("5=Alfabético Vocal minúscula");
      }
      if (a.other) {
      	System.out.println("6=Otro tipo de símbolo");
      }
    
    }//fin method
    
}//fin class MainASCII
