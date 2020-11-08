
/**
 * Use los comentarios para explicar el objetivo de este programa MainMoon .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
import java.util.Scanner;
public class MainMoon
{
    public static void main(String[] args) {

        MoonCalendar mc = new MoonCalendar();

        Scanner sc = new Scanner(System.in);

        mc.day = sc.nextInt();
        mc.month = sc.nextInt();
        mc.year = sc.nextInt();

        mc.algoritmo();

        if ((mc.lunarYear2>=0 & mc.lunarYear2<7) | (mc.lunarYear2>21 & mc.lunarYear2<=29))
            System.out.println("Luna Nueva");

        if (mc.lunarYear2>=7 & mc.lunarYear2<14)
            System.out.println("Cuarto Creciente");

        if (mc.lunarYear2>=14 & mc.lunarYear2<21)
            System.out.println("Luna Llena");

        if (mc.lunarYear2>=21 & mc.lunarYear2<29)
            System.out.println("Cuarto Menguante");

    }//fin method
}//fin class MainMoon
