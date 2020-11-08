
/**
 * Use los comentarios para explicar el objetivo de este programa MainTime .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
import java.util.Scanner;
public class MainTime
{
	public static void main(String[] args) {
		
	TiempoTranscurrido t = new TiempoTranscurrido();

	Scanner sc = new Scanner(System.in);


	System.out.println("Escriba el numero: ");
    t.num = sc.nextLong();
   
    
    t.algoritmo();

    System.out.println("El tiempo transcurrido en días es: " +t.two);
    
    
    }//fin method
    
}//fin class MainTime