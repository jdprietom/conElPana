
/**
 * Use los comentarios para explicar el objetivo de este programa Rectangulo .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (18/10/2020)
 */
public class Rectangulo
{
    /*	Coordenada X esquina = xTopL ((X = Esquina Superior Izquierda) => xTopL)
    	Coordenada Y esquina = yTopL ((Y = Esquina Superior Izquierda) => xTopL)
    	Ancho = wid (width)
    	Alto = hei (height)
		Coordenada X del punto = xP
		Coordenada Y del punto = yP    	

		X superior Derecha = xTopR
		Y superior Derecha = yTopR
		X inferior Izquierda = xLeft
		Y inferior Izquierda = yLeft
		X inferior Derecha = xRight
		Y inferior Derecha = yRight		*/
	double xTopL, yTopL, wid, hei, xP, yP;
    double xTopR, yTopR, xLeft, yLeft, xRight, yRight;
    
   	/*  Punto Dentro = pIn
        Punto Fuera = pOut
        Punto En Borde Superior = pTop
        Punto En Borde Inferior = pBot (Bot = Bottom)
        Punto En Borde Izquierdo = pLeft
        Punto En Borde Derecho = pRight	*/ 
    boolean pIn, pOut, pTop, pBot, pLeft, pRight;

    void algoritmo(){
      
      xTopR = xTopL+wid;
      yTopR = yTopL;
      xLeft = xTopL;
      yLeft = yTopL-hei;
      xRight = xLeft+wid;
      yRight = yTopR-hei;

      pIn = (xP>xLeft && xP<xTopR) && (yP<yTopR && yP>yLeft);
      pOut = (xP<xLeft || xP>xTopR) || (yP>yTopR || yP<yLeft);
      pTop = (xP>xLeft && xP<xTopR) && (yP==yTopR);
      pBot = (xP>=xLeft && xP<=xRight) && (yP==yLeft);
      pLeft = (xP==xLeft) && (yP<=yTopR && yP>=yLeft);
      pRight = (xP==xTopR) && (yP<=yTopR && yP>=yRight);

    
    }//fin method
    
}//fin class Rectangulo
