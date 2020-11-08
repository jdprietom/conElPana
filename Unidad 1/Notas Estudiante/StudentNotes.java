
/**
 * Use los comentarios para explicar el objetivo de este programa StudentNotes .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (14/10/2020)
 */
public class StudentNotes
{
	// Escriba la nota = note
    float note;

    /* 	Nota Valida = valid
    	Nota muy Deficiente = noteMD
    	Nota Deficiente = noteD
    	Nota Aceptable = noteA
    	Nota Buena = noteB
    	Nota Excelente = NoteE
    */
    boolean valid,noteMD,noteD,noteA,noteB,noteE;


    void algoritmo( ){
      
      valid = note<=5 && note>=0 ? true : false;
      noteMD = note>=0 && note<3 ? true : false; 
      noteD = note>=3 && note<(3.5) ? true : false;
      noteA = note>=(3.5) && note<4 ? true : false; 
      noteB = note>=4 && note<(4.5) ? true : false;
      noteE = note>=(4.5) && note<=5 ? true : false;
    
    }//fin method
    
}//fin class StudentNotes
