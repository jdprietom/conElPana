
/**
 * Use los comentarios para explicar el objetivo de este programa MainHoroscopo .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
import java.util.Scanner;
public class MainHoroscopo2
{
    public static void main(String[] args) {

    Horoscopo2 h = new Horoscopo2();
    
    Scanner sc = new Scanner(System.in);
     	
        h.date = sc.nextLong();

    h.algoritmo();
              
        if (!(h.prove)){
           	System.out.println("Fecha no válida");
        }


    }//fin method
    
}//fin class MainHoroscopo
