
/**
 * Use los comentarios para explicar el objetivo de este programa TwoCircles .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (29/10/2020)
 */
public class TwoCircles
{
    /*  r1 = radio 1            r2 = radio 2
        x1 = Coordenada x1      x2 = Coordenada x2
        y1 = Coordenada y1      y2 = Coordenada y2
        px = Punto X
        py = Punto Y
        dis = Distancia                             */
        
    double r1, x1, y1, r2, x2, y2;
    double px, py, xM, yM, dis;

    /*  outside = exteriores
        inside = Interiores
        tanOut = tangentesExteriores
        tanIn = tangentesInteriores
        sec = secantes
        conc = concentric
        rPlus = Suma de Radios
        rMinus = Resta de Radios 					
        cDis = Centers distance						*/

    boolean outside, inside, tanOut, tanIn, sec, conc;
    double rPlus, rMinus, cDis;



    
    void algoritmo(){
      
      	px = ((x1) - (x2));
        py = ((y1) - (y2));
        
        xM = Math.pow(px,2);
        yM = Math.pow(py,2);
        dis = Math.sqrt(xM + yM);

        cDis = (dis);
        rPlus = (r1 + r2);
        rMinus = (r1 - r2);
        outside = cDis > rPlus;
        tanOut = cDis == rPlus;
        sec = (cDis < rPlus) && (cDis > rMinus);
        tanIn = cDis == rMinus;
        inside = (cDis < rMinus) && !(cDis == 0);
        conc = cDis == 0;    
          
    }//fin method
    
}//fin class TwoCircles
