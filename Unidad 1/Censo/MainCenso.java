
/**
 * Use los comentarios para explicar el objetivo de este programa MainCenso .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (14/10/2020)
 */
import java.util.Scanner;
public class MainCenso
{

public static void main(String[] args) {
	
	Censo c = new Censo();
	Scanner sc = new Scanner(System.in);

		System.out.println("Edad: ");
    		c.age = sc.nextDouble();
    	System.out.println("Estatura: ");
    		c.hei = sc.nextDouble();
    	System.out.println("Peso: ");
    		c.wei = sc.nextDouble();
    	
    c.algoritmo();

    	System.out.println("Edad fuera de rango: "+c.ageOut);
    	System.out.println("Estatura fuera de rango: "+c.heiOut);
    	System.out.println("Peso fuera de rango: "+c.weiOut);
    	System.out.println("Joven: "+c.young);
    	System.out.println("Adulto: "+c.adult);
    	System.out.println("Segunda Edad: "+c.old);
    	System.out.println("Estatura Baja: "+c.hShort);
    	System.out.println("Estatura Promedio: "+c.hAvg);
    	System.out.println("Estatura Alta: "+c.hTall);
    	System.out.println("Peso Bajo: "+c.wLow);
    	System.out.println("Peso Promedio: "+c.wAvg);
    	System.out.println("Peso Alto: "+c.wHigh);

    }//fin method
    
}//fin class MainCenso
