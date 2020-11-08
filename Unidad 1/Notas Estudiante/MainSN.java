
/**
 * Use los comentarios para explicar el objetivo de este programa MainSN .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (14/10/2020)
 */
import java.util.Scanner;
public class MainSN
{
    public static void main(String[] args) {
    	
    	StudentNotes sn = new StudentNotes();
    	Scanner sc = new Scanner(System.in);


    	System.out.println("Escriba la nota: ");
    		sn.note = sc.nextFloat();

    
      	sn.algoritmo();

      		System.out.println("Nota valida: "+sn.valid);
      		System.out.println("Nota Muy Deficiente: "+sn.noteMD);
        	System.out.println("Nota Deficiente: "+sn.noteD);
        	System.out.println("Nota Aceptable: "+sn.noteA);
        	System.out.println("Nota Buena: "+sn.noteB);
        	System.out.println("Nota Excelente: "+sn.noteE);


    }//fin method
    
}//fin class MainSN
