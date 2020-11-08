
/**
 * Use los comentarios para explicar el objetivo de este programa Circunferencia .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (15/10/2020)
 */

public class Circunferencia
{
    /*  Coordenada X del centro = midX
        Coordenada Y del centro = midY
        Radio = r                       
        Coordenada X del punto = dotX 
        Coordenada Y del punto = dotY   */

    double midX, midY, dotX, dotY, r;
    
    /*  Punto Dentro = pIn
        Punto Fuera = pOut
        Punto En Borde = pEdge  */

    boolean pIn, pOut, pEdge;
    
    void algoritmo(){


        pIn = ((dotX-midX)*(dotX-midX))+((dotY-midY)*(dotY-midY))<(Math.pow(r,2)) ? true : false;
        pOut = ((dotX-midX)*(dotX-midX))+((dotY-midY)*(dotY-midY))>(Math.pow(r,2)) ? true : false;
        pEdge = ((dotX-midX)*(dotX-midX))+((dotY-midY)*(dotY-midY))==(Math.pow(r,2)) ? true : false;
    
    
    }   //fin method   
}   //fin class Circunferencia
