
/**
 * Use los comentarios para explicar el objetivo de este programa MainCenso .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
import java.util.Scanner;
public class MainCensoIF
{

public static void main(String[] args) {
	
	CensoIF c = new CensoIF();
	Scanner sc = new Scanner(System.in);

		System.out.println("Edad: ");
    		c.age = sc.nextDouble();
    	System.out.println("Estatura: ");
    		c.hei = sc.nextDouble();
    	System.out.println("Peso: ");
    		c.wei = sc.nextDouble();
    	
    c.algoritmo();

    	
    	if(c.ageOut == true){
    		System.out.println("Edad fuera de rango.");
    	}
    	else{
    		if (c.young == true) {
    			System.out.println("Joven.");
    		}
    		if (c.adult == true) {
    			System.out.println("Adulto.");
    		}
    		if (c.old == true) {
    			System.out.println("Segunda Edad.");
    		}
    	}

    	if (c.heiOut == true) {
    		System.out.println("Estatura fuera de rango.");
    	}
    	else{
    		if (c.hShort == true) {
    			System.out.println("Estatura Baja.");
    		}
    		if (c.hAvg == true) {
    			System.out.println("Estatura Promedio.");
    		}
    		if (c.hTall == true) {
    			System.out.println("Estatura Alta.");
    		}
    	}

    	if (c.weiOut == true) {
    		System.out.println("Peso fuera de rango.");
    	}
    	else{
    		if (c.wLow == true) {
    			System.out.println("Peso Bajo.");
    		}
    		if (c.wAvg == true) {
    			System.out.println("Peso Promedio.");
    		}
    		if (c.wHigh == true) {
    			System.out.println("Peso Alto.");
    		}
    	}

    }//fin method
    
}//fin class MainCenso
