
/**
 * Use los comentarios para explicar el objetivo de este programa MainSW .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (22/10/2020)
 */
import java.util.Scanner;
public class MainSW
{
    public static void main(String[] args) {
    	
    SmartWatch sw = new SmartWatch();

    Scanner sc = new Scanner(System.in);

    System.out.println("Número");
    	sw.num = sc.nextInt();
    System.out.println("Letra");
    	sw.in = sc.next().charAt(0);
    
    sw.algoritmo();

    	System.out.println("Hora Valida: "+sw.out);
               
    }//fin method
    
}//fin class MainSW
