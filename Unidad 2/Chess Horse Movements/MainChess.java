
/**
 * Use los comentarios para explicar el objetivo de este programa MainChess .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
import java.util.Scanner;
public class MainChess
{
    public static void main(String[] args) {
    	
    HorseMove hm = new HorseMove();

    Scanner sc = new Scanner(System.in);

    	hm.iC = sc.next().charAt(0);
        hm.iR = sc.nextInt();
        hm.fC = sc.next().charAt(0);
        hm.fR = sc.nextInt();
    
    hm.algoritmo();
      
      if (!hm.num1 | !hm.letters1 | !hm.num2 | !hm.letters2){
            if (!hm.num1 | !hm.letters1){
                System.out.println("Coordenada Inicial no Válida");
            }
            if (!hm.num2 | !hm.letters2){
                System.out.println("Coordenada Final no Válida");
            }
        }
        if (hm.move1 | hm.move2 | hm.move3 | hm.move4 | hm.move5 | hm.move6 | hm.move7 | hm.move8){
            if (hm.move1)
                System.out.println("Movimiento 1");
            if (hm.move2)
                System.out.println("Movimiento 2");
            if (hm.move3)
                System.out.println("Movimiento 3");
            if (hm.move4)
                System.out.println("Movimiento 4");
            if (hm.move5)
                System.out.println("Movimiento 5");
            if (hm.move6)
                System.out.println("Movimiento 6");
            if (hm.move7)
                System.out.println("Movimiento 7");
            if (hm.move8)
                System.out.println("Movimiento 8");
        }
        else if (hm.letters1 & hm.letters2 & hm.num1 & hm.num2){
            System.out.println("No es un Caballo");
        }

    }//fin method
    
}//fin class MainChess
