
/**
 * Use los comentarios para explicar el objetivo de este programa ASCII .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (01/11/2020)
 */
public class ASCII
{
    char symbol;

    boolean digit, mayus, minus, vocalMayus, vocalMinus, other;
    
    void algoritmo( ){
      
      	digit = symbol >= 48 && symbol <= 57;
      
      	vocalMayus = symbol=='A' || symbol=='E' || symbol=='I' || symbol=='O' || symbol=='U';
      	mayus = !vocalMayus && (symbol > 65 && symbol <= 90);

      	vocalMinus = symbol=='a' || symbol=='e' || symbol=='i' || symbol=='o' || symbol=='u';
    	minus = !vocalMinus && (symbol > 97 && symbol <= 122);

    	other = !digit && !vocalMayus && !mayus && !vocalMinus && !minus;

    }//fin method
    
}//fin class ASCII
