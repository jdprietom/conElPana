
/**
 * Use los comentarios para explicar el objetivo de este programa BinaryMorse .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (07/11/2020)
 */
public class BinaryMorse
{
    long morse;

    String digit;
    //lD = third digit, mD = second digit, fD = first digit 
    String tD, sD, fD;

    String algoritmo(){
        switch((int)(morse%(long)100000)){
            case 0: digit = "0"; break;
            case 10000: digit = "1"; break;
            case 11000: digit = "2"; break;
            case 11100: digit = "3"; break;
            case 11110: digit = "4"; break;
            case 11111: digit = "5"; break;
            case 1111: digit = "6"; break;
            case 111: digit = "7"; break;
            case 11: digit = "8"; break;
            case 1: digit = "9"; break;
            default: digit = "";
        }
        morse/=100000;
        return digit;
    }//fin method

}//fin class BinaryMorse
