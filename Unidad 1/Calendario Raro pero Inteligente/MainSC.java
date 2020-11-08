
/**
 * Use los comentarios para explicar el objetivo de este programa MainSC .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (22/10/2020)
 */
import java.util.Scanner;
public class MainSC
{
    public static void main(String[] args) {
    	
    SmartCalendar sm = new SmartCalendar();

    Scanner sc = new Scanner(System.in);

    	sm.num = sc.nextInt();
    
    sm.algoritmo();

    	System.out.println("Fecha Rara: "+sm.x1+sm.x2+sm.x3+sm.x4+sm.y22+sm.y2+sm.y11+sm.y1);
      	          
    }//fin method
    
}//fin class MainSC
