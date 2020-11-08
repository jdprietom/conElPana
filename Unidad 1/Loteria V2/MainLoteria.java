
import java.util.Scanner;
public class MainLoteria
{
	public static void main(String[] args) {
		
		
		Loteria l = new Loteria();
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero Ganador: ");
			l.win = sc.next();
		System.out.println("Numero Apostado: ");
			l.bet = sc.next();
		System.out.println("Apuesta a Pleno: ");
			l.betF = sc.nextInt();
		System.out.println("Apuesta a Pleno Invertido: ");
			l.betI = sc.nextInt();
		System.out.println("Apuesta a Pata: ");
			l.betL = sc.nextInt();

	
	l.algoritmo();
      

			System.out.println("Gana Pleno: "+l.won);
			System.out.println("Gana Pleno Invertido: "+l.wonI);
			System.out.println("Gana Pata: "+l.wonL);
			System.out.println("Valor Gana Pleno: "+l.valueW);
			System.out.println("Valor Gana Pleno Invertido: "+l.valueI);
			System.out.println("Valor Gana Pata: "+l.valueL);
			System.out.println("Valor Gana Total: "+l.total);
    
    }//fin method
    
}//fin class MainLoteria

