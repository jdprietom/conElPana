
/**
 * Use los comentarios para explicar el objetivo de este programa MainSW .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
import java.util.Scanner;
public class MainSW_IF
{
    public static void main(String[] args) {
    	
    SmartWatchIF sw = new SmartWatchIF();

    Scanner sc = new Scanner(System.in);

    	sw.num = sc.nextInt();

    	sw.in = sc.next().charAt(0);
    
    sw.algoritmo();

        if(sw.out == true) {
            System.out.println("Hora Válida");
        }
        else{
            System.out.println("Hora NO es Válida");
        }

    }//fin method
    
}//fin class MainSW
