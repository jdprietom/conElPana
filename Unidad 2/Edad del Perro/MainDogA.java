
/**
 * Use los comentarios para explicar el objetivo de este programa MainDogA .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (30/10/2020)
 */
import java.util.Scanner;
public class MainDogA
{
   public static void main(String[] args) {
   	
  		DogAge da = new DogAge();
  		Scanner sc = new Scanner(System.in);


  		System.out.println("Edad del Humano:");
  			da.humanAge = sc.nextInt();
    
    da.algoritmo();
      
      	if(da.humanAge<0) {
      		System.out.println("Datos no Válidos");
      		
      	}
      	else{
      	System.out.println("Edad del Perro: "+da.dogAge);
    	}

    }//fin method
    
}//fin class MainDogA
