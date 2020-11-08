
/**
 * Use los comentarios para explicar el objetivo de este programa MainEX_IF .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
import java.util.Scanner;
public class MainEX_IF
{
    public static void main(String[] args) {

        ExchangeHouseIF eh = new ExchangeHouseIF();
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


            if (eh.validI == true) {
            	System.out.println("El negocio va bien ;)");
            }
            else{
            	System.out.println("Hay pérdidas. Cambie de Casa de Cambio.");
            }

    
    }//fin method
    
}//fin class MainEX_IF
