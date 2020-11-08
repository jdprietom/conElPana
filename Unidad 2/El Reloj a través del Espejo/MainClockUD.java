
/**
 * Use los comentarios para explicar el objetivo de este programa MainClockUD .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (03/11/2020)
 */
import java.util.Scanner;
public class MainClockUD
{
    public static void main(String[] args) {

        ClockUpsideDown c = new ClockUpsideDown();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hora en el espejo: ");
        
            c.time = sc.nextInt();
        
        c.algoritmo(); 
        if ( !(c.time/100<13 && c.time%100<60) || c.time<100) {
            System.out.println("Datos Incorrectos");
        }
        else{    
            if (c.realHours<=9) 
                System.out.print("Hora Real: "+"0"+c.realHours+":");
            if (c.realHours>=10) 
                System.out.print("Hora Real: "+c.realHours+":");
            if (c.realMinutes<=9)
                System.out.println("0"+c.realMinutes);
            if (c.realMinutes>=10) {
                System.out.println(c.realMinutes);
            }

        }

    }//fin method

}//fin class MainClockUD
