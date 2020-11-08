
/**
 * Use los comentarios para explicar el objetivo de este programa RotationAxes .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
public class RotationAxes
{
    double x1, y1, x2, y2, x3, y3, x4, y4;
    double px, py, xM, yM, h;

     /* cos = cosine            sin = sine
        xp1 = point x1          xp2 = point x1
        yp1 = point y1          yp2 = point y2
        xp3 = point x3          xp4 = point x4
        yp3 = point y3          yp4 = point y4

                   hyp = hypotenuse
        opposite                       adjacent 

            	    rad = radians
            	    deg = degrees							 */
       
    double cos, sin, xp1, yp1, xp2, yp2, xp3, yp3, xp4, yp4;
    double hyp, opposite, adjacent, rad, deg;
    
    void algoritmo(){
      
      	px = ((x1) - (x2));
        py = ((y1) - (y2));
        
        xM = Math.pow(px,2);
        yM = Math.pow(py,2);
        h = Math.sqrt(xM + yM);

        
        hyp = (h);
        adjacent = Math.abs( x2 - x1 );
        opposite = Math.abs( y2 - y1 );
        
        sin = opposite / hyp;       
        cos = adjacent / hyp;

        rad = Math.acos(cos);
        deg = ((180*rad)/Math.PI);

        
        xp1 = (x1 * cos) - (y1 * sin);
        xp2 = (x2 * cos) - (y2 * sin);
        xp3 = (x3 * cos) - (y3 * sin);
        xp4 = (x4 * cos) - (y4 * sin);


        yp1 =  (x1 * sin) + (y1 * cos);
        yp2 =  (x2 * sin) + (y2 * cos);
        yp3 =  (x3 * sin) + (y3 * cos);
        yp4 =  (x4 * sin) + (y4 * cos);
    
    }//fin method
    
}//fin class RotationAxes
