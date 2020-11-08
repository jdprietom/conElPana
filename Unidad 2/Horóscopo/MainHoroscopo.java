
/**
 * Use los comentarios para explicar el objetivo de este programa MainHoroscopo .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (03/11/2020)
 */
import java.util.Scanner;
public class MainHoroscopo
{
    public static void main(String[] args) {

    Horoscopo h = new Horoscopo();
    
    Scanner sc = new Scanner(System.in);
     	
        h.date = sc.nextLong();

    h.algoritmo();
              
        if (!(h.prove)){
           	System.out.println("Fecha no válida");
        }
        else{

            System.out.printf("Su Horóscopo es %s / %s\n",(h.zodiacSign),(h.chineseYear));
        }

    }//fin method
    
}//fin class MainHoroscopo
