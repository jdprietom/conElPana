
/**
 * Use los comentarios para explicar el objetivo de este programa InternetSpeed .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (08/10/2020)
 */
public class InternetSpeed
{
    public static void main(String[] args) {

        Consola c = new Consola();

        /* Speed in Mbps = mbps
        Bytes to transmit = byyes
        Transfer Time = time
         */

    		int mbps, bytes;
    		int time;

    		mbps = c.leerEntero("Velocidad en Mbps: ");

    		bytes = c.leerEntero("Bytes a transmitir: ");

    		time = bytes/(mbps*125000);

    			c.imprimir("Tiempo de Transferencia : " + time);

    }
    
}//fin class InternetSpeed
