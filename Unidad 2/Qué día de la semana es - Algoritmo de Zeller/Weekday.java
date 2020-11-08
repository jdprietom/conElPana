
/**
 * Use los comentarios para explicar el objetivo de este programa Weekday .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
public class Weekday
{
    int day, month, year;

    // d = day, y = year, m = month
    int d, y, m, equation; 

    void algoritmo( ){

        d = (14-month)/12;
        y = year-d;
        m = month+12*d-2;

        equation = (day + y + y/4 - y/100 + y/400 + (31*m)/12) % 7;

    }//fin method

}//fin class Weekday
