
/**
 * Use los comentarios para explicar el objetivo de este programa MainMMM .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
import java.util.Scanner;
public class MainMMM
{
    public static void main(String[] args) {
    	
    MajorMinorMiddle mm = new MajorMinorMiddle();

    Scanner sc = new Scanner(System.in);

    	mm.x = sc.nextLong();

        mm.y = sc.nextLong();

        mm.z = sc.nextLong();
    
    mm.algoritmo();
      
      if (mm.xMa){
            System.out.println("Mayor= " +mm.x);   
            if (mm.xMaY){
                System.out.println("Medio= " +mm.y);
                System.out.println("Menor= " +mm.z);
            }
            else {
                System.out.println("Medio= " +mm.z);
                System.out.println("Menor= " +mm.y);
            }
        }
        if(mm.yMa){
            System.out.println("Mayor= " +mm.y);
            if(mm.yMaZ){
                System.out.println("Medio= " +mm.x);
                System.out.println("Menor= " +mm.z);
            }
            else {
                System.out.println("Medio= " +mm.z);
                System.out.println("Menor= " +mm.x);
            }
        }
        if(mm.zMa){
            System.out.println("Mayor= " +mm.z);
            if(mm.zMaX){
                System.out.println("Medio= " +mm.x);
                System.out.println("Menor= " +mm.y);
            }
            else {
                System.out.println("Medio= " +mm.y);
                System.out.println("Menor= " +mm.x);
            }
        }
    
    }//fin method
    
}//fin class MainMMM
