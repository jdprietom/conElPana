
/**
 * Use los comentarios para explicar el objetivo de este programa MajorMinorMiddle .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
public class MajorMinorMiddle
{
    long x, y, z;
    
    // xMajor, yMajor, zMajor
    boolean xMa, yMa, zMa;
    // xMajorYmid, yMajorZmin, zMajorXmid  /  mid = middle / min = minor 
    boolean xMaY, yMaZ, zMaX;

    void algoritmo( ){
      
    xMa = (x>=y & x>=z);
    xMaY = (y>=z);

    yMa = (y>=x & y>=z);
    yMaZ = (z<=x);

    zMa = (z>=x & z>=y);
    zMaX = (x>=y);
    }//fin method
    
}//fin class MajorMinorMiddle
