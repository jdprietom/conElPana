
/**
 * Use los comentarios para explicar el objetivo de este programa Cuadrantes .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (19/10/2020)
 */
public class Cuadrantes
{
    /*  Coordenada X del primer punto = x1p
        Coordenada Y del primer punto = y1p
        Coordenada X del segundo punto = x2p
        Coordenada Y del segundo punto = y2p
        Absolute Value = x1av
        Absolute Value = y1av
        Absolute Value = x2av
        Absolute Value = y2av
        Pendiente = m                           */

        double x1p, y1p, x2p, y2p;
        double x1av, y1av, x2av, y2av, m;

    /*  Quadrant 1 = q1
        Quadrant 2 = q2
        Quadrant 3 = q3
        Quadrant 4 = q4

        Si la Pendiente es 0 = m0
        Origen = o
        
        A Quadrant = oneQ
        Two Quadrant = twoQ
        Three Quadrant = threeQ     */ 

        boolean q1, q2, q3, q4, m0, xQ, yQ, o;
        boolean q1t, q2t, q3t, q4t; //two = t entonces (Quadrant 1)v2 = q1t

        boolean oneQ, twoQ, threeQ;

    void algoritmo(){
      
        x1av = Math.abs(x1p);
        y1av = Math.abs(y1p);
        x2av = Math.abs(x2p);
        y2av = Math.abs(y2p);

        o =  ((x1p==y1p) && (x2p==y2p)) || ((x1av==y1av) && (x2av==y2av));

        m = (((y2p-y1p)/(x2p-x1p))*100)/100;
        m = Math.round(m*100)/100d;
        
        m0 = m==0;

        q1 = (x1p>=0 & y1p>=0) | (x2p>=0 & y2p>=0);
        q3 = (x1p<0 && y1p<0) || (x2p<0 && y2p<0);
        q4 = ((x1p>0 && y1p<0) || (x2p>0 && y2p<0));
        q2 = (((q1==q3)& m==1)& o==false) | ((x1p<0 && y1p>0) || (x2p<0 && y2p>0)); 

        xQ = ((x1p<=0 && x2p<=0) || (x1p>=0 && x2p>=0));
        yQ = ((y1p<=0 && y2p<=0) || (y1p>=0 && y2p>=0));

        q1t = (q1) | ((q2==q4) & m==-0.6);
        q2t = (((q1==q3) & m==1) & o==false) | ((x1p<0 & y1p>0) | (x2p<0 & y2p>0));
        q4t = ((x1p>0 & y1p<0) | (x2p>0 & y2p<0)) | (q1t==q3) & (m==1.5); 
        q3t = ((q2==q4t) & m == (-1.5)) | ((x1p<0 & y1p<0) | (x2p<0 & y2p<0));

        oneQ = xQ && yQ;
        threeQ = (q1t & q2t & q3t) | (q1t & q2t & q4t) | (q1t & q3t & q4t) | (q2t & q3t & q4t);
        twoQ = !oneQ && !threeQ;

    }//fin method
    
}//fin class Cuadrantes
