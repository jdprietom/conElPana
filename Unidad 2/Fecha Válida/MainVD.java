
/**
 * Use los comentarios para explicar el objetivo de este programa MainVD .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (01/11/2020)
 */
import java.util.Scanner;
public class MainVD
{
    public static void main(String[] args) {
        
        ValidDate vd = new ValidDate();

        Scanner sc = new Scanner(System.in);

        vd.day = sc.nextInt();
        vd.month = sc.next().charAt(0);
        vd.year = sc.nextInt();
 
    vd.algoritmo();

        if (vd.day<=0 || !(vd.month2) || vd.year<=0){
            System.out.println("Datos de entrada incorrectos");
        
        }
        else{
        if (((vd.day>0 || vd.day>31) || !(vd.feb) & (vd.month2)) & !(vd.date)){
        System.out.println("Fecha NO Válida");
   
        }
        if ((vd.date) || (vd.feb)){
            System.out.println("Fecha Válida");
        }
    }
 
    
 
    }//fin method
    
}//fin class MainVD
