
/**
 * Use los comentarios para explicar el objetivo de este programa ValidDate .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (01/11/2020)
 */
public class ValidDate
{
    int day, year;
    char month;

    // leapYear = Año Bisiestos
    boolean date, m30, m31, month2, feb, leapYear; 

    void algoritmo(){
      
        m30 = (month=='A' || month=='J' || month=='S' || month=='N');
        m31 = (month=='E' || month=='M' || month=='Y' || month=='L' || month=='G' || month=='O' || month=='D');

        leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        feb = ((day<=28 && day>0) && (month == 'F')) || ((leapYear) & ((day<=29 & day>0)  & month=='F'));

        month2 = (m30 || m31 || (month=='F'));

        date = ((day<31 & day>0) & (m30)) || ((day<32 & day>0) & (m31)) || (feb);
     
    
    }//fin method
    
}//fin class ValidDate
