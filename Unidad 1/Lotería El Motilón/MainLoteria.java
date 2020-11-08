
/**
 * Use los comentarios para explicar el objetivo de este programa MainLoteria .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (16/10/2020)
 */
import java.util.Scanner;
public class MainLoteria
{
	public static void main(String[] args) {

		
    Loteria l = new Loteria();
	Scanner sc = new Scanner(System.in);
    //inputs
		System.out.println("Numero Ganador: ");
			l.win = sc.nextInt();
		System.out.println("Numero Apostado: ");
			l.bet = sc.nextInt();
		System.out.println("Apuesta a Pleno: ");
			l.betF = sc.nextInt();
		System.out.println("Apuesta a Pleno Invertido: ");
			l.betI = sc.nextInt();
		System.out.println("Apuesta a Pata: ");
			l.betL = sc.nextInt();
      //Llamado al metodo
      l.algoritmo();
      //outputs
			System.out.println("Gana Pleno: "+l.won);
			System.out.println("Gana Pleno Invertido: "+l.wonI);
			System.out.println("Gana Pata: "+l.wonL);
			System.out.println("Valor Gana Pleno: "+l.valueW);
			System.out.println("Valor Gana Pleno Invertido: "+l.valueI);
			System.out.println("Valor Gana Pata: "+l.valueL);
			System.out.println("Valor Gana Total: "+l.total);
  }
  //fin method
}
//fin class MainLoteria
