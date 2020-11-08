
/**
 * Use los comentarios para explicar el objetivo de este programa MainEC .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (12/10/2020)
 */
import java.util.Scanner;
public class MainEC{

public static void main(String[] args) {
    
    EcuacionCuadratica ec = new EcuacionCuadratica();
    Scanner sc = new Scanner(System.in);

    System.out.println("a= ");
            ec.a = sc.nextInt();
        System.out.println("b= ");
            ec.b = sc.nextInt();
        System.out.println("c= ");
            ec.c = sc.nextInt();
    
    ec.algoritmo();
      
      	System.out.println("Concavidad hacia arriba: "+ec.up);
        System.out.println("Concavidad hacia abajo:  "+ec.down);
        System.out.println("No hay soluciones: "+ec.e);
        System.out.println("Hay una solución: "+ec.f);
        System.out.println("Hay dos soluciones: "+ec.g);
        System.out.println("Solucion: "+("( "+"-"+ec.b+" "+"\u00b1"+" "+"\u221a"+"("+(int)ec.d+")"+" )")+" "+"/"+" "+((ec.a)*2));

    
    }   
}//fin class MainEC
