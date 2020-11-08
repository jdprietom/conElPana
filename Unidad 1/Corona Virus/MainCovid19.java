
/**
 * Use los comentarios para explicar el objetivo de este programa MainCovid19 .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (08/10/2020)
 */
import java.util.Scanner;
public class MainCovid19
{
    public static void main(String[] args) {

        Covid19 c19 = new Covid19();
        Scanner scan = new Scanner(System.in);

        System.out.println("Contagiados dia 1: ");
            c19.d1 = scan.nextInt();
        System.out.println("Contagiados dia 2: ");
            c19.d2 = scan.nextInt();
        System.out.println("Contagiados dia 3: ");
            c19.d3 = scan.nextInt();
        System.out.println("Contagiados dia 4: ");
            c19.d4 = scan.nextInt();
        System.out.println("Contagiados dia 5: ");
            c19.d5 = scan.nextInt();
        System.out.println("Contagiados dia 6: ");
            c19.d6 = scan.nextInt();
            
            
            c19.algoritmo();
            
            System.out.println("Porcentaje de Contagio 1: "+c19.perc1);
            System.out.println("Porcentaje de Contagio 2: "+c19.perc2);
            System.out.println("Porcentaje de Contagio 3: "+c19.perc3);
            System.out.println("Porcentaje de Contagio 4: "+c19.perc4);
            System.out.println("Porcentaje de Contagio 5: "+c19.perc5);
            System.out.print("Promedio del Porcentaje: "+c19.avg);
            
    
   

    }
}//fin class MainCovid19
