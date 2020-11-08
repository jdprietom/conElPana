
/**
 * Use los comentarios para explicar el objetivo de este programa MainSN .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
import java.util.Scanner;
public class MainSN
{
   public static void main(String[] args) {
   	
   	StudentNotesIF sn = new StudentNotesIF();

   	Scanner sc = new Scanner(System.in);

   	System.out.println("Escriba la nota: ");
    		sn.note = sc.nextFloat();


    	if(sn.note<0 || sn.note>5){

    		System.out.println("La calificación no es válida (fuera del rango [0,5]).");
    		
    	}
    	else{
    
      	sn.algoritmo();

      	 	if(sn.noteMD == true) {
				System.out.println("La calificación es muy deficiente.");
			}
			if(sn.noteD == true) {
				System.out.println("La calificación es deficiente.");
			}
			if(sn.noteA == true){
				System.out.println("La calificación es aceptable");
			}
			if(sn.noteB == true) {
				System.out.println("La calificación es buena");
			}
			if(sn.noteE == true) {
				System.out.println("La calificación es excelente");
			}
        }

    }//fin method
    
}//fin class MainSN