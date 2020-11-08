
/**
 * Use los comentarios para explicar el objetivo de este programa MainWeekday .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
import java.util.Scanner;
public class MainWeekday
{
    public static void main(String[] args) {

        Weekday w = new Weekday();

        Scanner sc = new Scanner(System.in);

        w.day = sc.nextInt();

        w.month = sc.nextInt();

        w.year = sc.nextInt();

        w.algoritmo();

        if (w.equation==0)
            System.out.println("Domingo");

        if (w.equation==1)
            System.out.println("Lunes");

        if (w.equation==2)
            System.out.println("Martes");

        if (w.equation==3)
            System.out.println("Miércoles");   

        if (w.equation==4)
            System.out.println("Jueves");

        if (w.equation==5)
            System.out.println("Viernes");

        if (w.equation==6)
            System.out.println("Sábado");

    }//fin method

}//fin class MainWeekday
