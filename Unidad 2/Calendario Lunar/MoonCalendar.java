
/**
 * Use los comentarios para explicar el objetivo de este programa MoonCalendar .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
public class MoonCalendar
{
    int day, month, year;

    int yearGold, lunarYear, month2, month3, month4, lunarYear2;

    void algoritmo( ){

        yearGold = (year+1)%19;
        lunarYear = ((yearGold-1)*11)%30;

        //January and February
        month2 = Math.abs(month-1);

        //March until December
        month3 = Math.abs(month-3);

        month4 = Math.min(month3,month2);

        lunarYear2 = (lunarYear+month4+day)%30; 

    }//fin method

}//fin class MoonCalendar
