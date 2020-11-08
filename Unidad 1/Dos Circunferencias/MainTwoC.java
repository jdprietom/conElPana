
/**
 * Use los comentarios para explicar el objetivo de este programa MainTwoC .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
import java.util.Scanner;
public class MainTwoC
{
    public static void main(String [] args)
    {
       
        TwoCircles tc = new TwoCircles();

        Scanner sc = new Scanner(System.in);
       

    //Input 
        System.out.println("Radio Circunferencia 1: ");
            tc.r1 = sc.nextDouble();
        System.out.println("Centro X Circunferencia 1: ");
            tc.x1 = sc.nextDouble();
        System.out.println("Centro Y Circunferencia 1: ");
            tc.y1 = sc.nextDouble();
        System.out.println("Radio Circunferencia 2: ");
            tc.r2 = sc.nextDouble();
        System.out.println("Centro X Circunferencia 2: ");
            tc.x2 = sc.nextDouble();
        System.out.println("Centro Y Circunferencia 2: ");
            tc.y2 = sc.nextDouble();
        
    //Output
        tc.algoritmo();

        System.out.println("Distancia entre centros = " + tc.cDis);
        System.out.println("Suma de radios          = " + tc.rPlus);
        System.out.println("Resta de radios         = " + tc.rMinus);
        System.out.println("Exteriores           = " + tc.outside);
        System.out.println("Tangentes Exteriores = " + tc.tanOut);
        System.out.println("Secantes             = " + tc.sec);
        System.out.println("Tangentes Interiores = " + tc.tanIn);
        System.out.println("Interiores           = " + tc.inside);
        System.out.println("Concéntricas         = " + tc.conc);
        
    }//fin method
    
}//fin class MainTwoC
