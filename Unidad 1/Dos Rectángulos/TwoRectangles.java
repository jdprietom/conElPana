
/**
 * Use los comentarios para explicar el objetivo de este programa TwoRectangles .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (30/10/2020)
 */
public class TwoRectangles
{
    
	/* 	wid1 = width1(Ancho)
		wid2 = width2(Ancho)
		hei1 = height(Alto) 
		hei2 = height(Alto) 					*/
    int x1, y1, x2, y2;
    int wid1, hei1, wid2, hei2;

    /*	"First Rectangle"	
	
    	X Superior Derecha = xTopR
		Y Superior Derecha = yTopR
		X Inferior Izquierda = xLeft
		Y Inferior Izquierda = yLeft
		X Inferior Derecha = xRight
		Y Inferior Derecha = yRight		 		*/	
    int xTopR, yTopR, xLeft, yLeft, xRight, yRight;
    
    /*	"Second Rectangle"

    	X Superior Derecha = xTopR2
		Y Superior Derecha = yTopR2
		X Snferior Izquierda = xLeft2
		Y Inferior Izquierda = yLeft2
		X Inferior Derecha = xRight2
		Y Inferior Derecha = yRight2		 	*/	
  	int xTopR2, yTopR2 , xLeft2, yLeft2, xRight2 , yRight2;

  	/*	Interior = inside
  		Exterior = outside
  		
  		Borde Superior = topEdge
        Borde Inferior = bottomEdge
        Borde Izquierdo = leftEdge
        Borde Derecho = rightEdge

        Tangent = tan
        Secant = sec							*/
 	boolean inside, outside, topEdge, bottomEdge, leftEdge, rightEdge, tan, sec;
    
    void algoritmo(){
      
       	xTopR = x1+wid1;
    	yTopR = y1;
    	xLeft = x1+wid1; 
    	yLeft = yTopR-hei1;
    	xRight = x1;
    	yRight = y1-hei1;
    
    
    	xTopR2 = x2+wid2;
    	yTopR2 = y2;
    	xLeft2 = x2+wid2; 
    	yLeft2 = yTopR2-hei2;
    	xRight2 = x2;
    	yRight2 = y2-hei2;


    	inside = ((x2>x1 & x2<xTopR) & (y2<y1 & y2>yLeft)) & ((xTopR2>x1 & xTopR2<xTopR) & (yTopR2<y1 & yTopR2>yLeft)) & 
    				((xLeft2>x1 & xLeft2<xTopR) & (yLeft2<y1 & yLeft2>yLeft)) & ((xRight2>x1 & xRight2<xTopR) & (yLeft2<y1 & yLeft2>yLeft));
    
    	outside = ((x2<x1 | x2>xTopR) | (y2>y1 | y2<yLeft)) & ((xTopR2<x1 | xTopR2>xTopR) | (yTopR2>y1 | yTopR2<yLeft)) &
    				((xLeft2<x1 | xLeft2>xTopR) | (yLeft2>y1 | yLeft2<yLeft)) & ((xRight2<x1 | xRight2>xTopR) | (yRight2>y1 | yRight2<yLeft));
    
    	topEdge = ((x2>x1 & x2<xTopR) & (y2==y1)) | ((xTopR2>x1 & xTopR2<xTopR) & (yTopR2==y1)) | ((xLeft2>x1 & xLeft2<xTopR) & (yLeft2==y1)) | 
    				((xRight2>x1 & xRight2<xTopR) & (yRight2==y1));
    
    	bottomEdge = ((x2>=x1 & x2<=xLeft) & (y2==yLeft)) | ((xTopR2>=x1 & xTopR2<=xLeft) & (yTopR2==yLeft)) |
    				((xLeft2>=x1 & xLeft2<=xLeft) & (yLeft2==yLeft)) | ((xRight2>=x1 & xRight2<=xLeft) & (yRight2==yLeft));
    
    	leftEdge = ((x2==x1) & (y2<=y1 & y2>=yLeft)) | ((xTopR2==x1) & (yTopR2<=y1 & yTopR2>=yLeft)) | ((xLeft2==x1) & (yLeft2<=y1 & yLeft2>=yLeft)) |
    				((xRight2==x1) & (yRight2<=y1 & yRight2>=yLeft));
    
    	rightEdge = ((x2==xTopR) & (y2<=y1 & y2>=yRight)) | ((xTopR2==xTopR) & (yTopR2<=y1 & yTopR2>=yRight)) | ((xLeft2==xTopR) & (yLeft2<=y1 & yLeft2>=yRight)) |
    				((xRight2==xTopR) & (yRight2<=y1 & yRight2>=yRight));
   
    	tan = (topEdge) || (bottomEdge) || (leftEdge) || (rightEdge);
    
    	sec = !(inside) && !(outside) && !(tan);
    
    }//fin method
    
}//fin class TwoRectangles
