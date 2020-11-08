
/**
 * Use los comentarios para explicar el objetivo de este programa MainHora .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (11/10/2020)
 */
import java.util.Scanner;
public class MainHora
{
    public static void main(String[] args) {
    	
    	HoraValida hv = new HoraValida();
    	Scanner sc = new Scanner(System.in);

    	System.out.println("Horas: ");
            hv.hours = sc.nextInt();
        System.out.println("Minutos: ");
            hv.minutes = sc.nextInt();
        System.out.println("Segundos: ");
            hv.seconds = sc.nextInt();


            hv.algoritmo();


       	 	System.out.println("¿Hora es válida? "+hv.valid);
       	 
    }
    
}//fin class MainHora
