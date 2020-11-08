
/**
 * Use los comentarios para explicar el objetivo de este programa DogAge .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (30/10/2020)
 */
public class DogAge
{
    int humanAge; 
    double dogAge;
    
    void algoritmo( ){
      
      if (humanAge==0) {
      	dogAge=0;
      }
      else{
      if (humanAge==1) {
      	dogAge=5;
      }
      
      else {	
      	if (humanAge==2) {
      		dogAge = 10.5;
      	}
      	else{
      		dogAge = 1.5 + 4.5 * (humanAge); //10.5 + 4.5 * (humanAge - 2)
      		}  
            }
	}
	    
    }//fin method
    
}//fin class DogAge
