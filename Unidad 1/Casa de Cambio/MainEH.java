
/**
 * Use los comentarios para explicar el objetivo de este programa MainEH .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
import java.util.Scanner;
public class MainEH
{
    public static void main(String[] args) {

        ExchangeHouse eh = new ExchangeHouse();
        Scanner scan = new Scanner(System.in);

        System.out.println("Precio de Compra del Dolar: ");
            eh.pPrice = scan.nextDouble();
        System.out.println("Precio de Venta del Dolar: ");
            eh.sPrice = scan.nextDouble();
        System.out.println("Cantidad Inicial de Pesos: ");
            eh.iaPesos = scan.nextDouble();
        System.out.println("Cantidad Inicial de Dolares: ");
            eh.iaDollar = scan.nextDouble();
        System.out.println("Cantidad Dolares Comprados: ");
            eh.dollarAP = scan.nextDouble();
        System.out.println("Cantidad Dolares Vendidos: ");
            eh.dollarAS = scan.nextDouble();
            
            
            eh.algoritmo();
            
            System.out.println("Cantidad Final de Pesos: "+eh.finalP);
            System.out.println("Cantidad Final de Dolares:  "+eh.finalD);
            System.out.println("Informacion valida: "+eh.validI);
               
   }
}//fin class MainEH
