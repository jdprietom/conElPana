
/**
 * Use los comentarios para explicar el objetivo de este programa MainOld .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
import java.util.Scanner;
public class MainOld
{
    public static void main(String[] args) {
    	
    HowOldAreYou ho = new HowOldAreYou();

    Scanner sc = new Scanner(System.in);

    	ho.bDate1 = sc.nextLong();

        ho.cDate2 = sc.nextLong();

    ho.algoritmo();
      
      if ((!ho.date1 & ho.date2) | (ho.date1 & !ho.date2)){
            System.out.println("Alguna de las fechas no es válida");
        }
        if (!ho.date1 & !ho.date2){
            System.out.println("Ninguna de las fechas es válida");
        }
        if ((ho.baby | ho.parvulo | ho.infant | ho.teen | ho.studentU | ho.graduate) & (ho.date1 & ho.date2)){
            if (ho.baby)
                System.out.println("Las fechas corresponden a un bebé");
            if (ho.parvulo)
                System.out.println("Las fechas corresponden a un párvulo");
            if (ho.infant)
                System.out.println("Las fechas corresponden a un infante");
            if (ho.teen)
                System.out.println("Las fechas corresponden a un adolescente");
            if (ho.studentU)
                System.out.println("Las fechas corresponden a un universitario");
            if (ho.graduate)
                System.out.println("¿Cuándo se gradúa?");
        }
    
    }//fin method
    
}//fin class MainOld
