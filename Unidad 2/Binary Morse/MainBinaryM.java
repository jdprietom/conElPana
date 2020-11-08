
/**
 * Use los comentarios para explicar el objetivo de este programa MainBinaryM .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (07/11/2020)
 */
public class MainBinaryM
{
    public static void main(String[] args) {

        BinaryMorse bm = new BinaryMorse();

        Consola c = new Consola();

        bm.morse = c.leerLong();

        if(bm.morse<0){
            c.imprimir("Error, número negativo");
        }
        else{
            if(bm.morse==0)
                System.out.println("Salida Binary Morse: 0");
            else{
                bm.tD = bm.algoritmo();
                bm.sD = bm.algoritmo();
                bm.fD = bm.algoritmo() ;
                bm.fD = bm.fD.equals("0") ? "":bm.fD;

                System.out.printf("Salida Binary Morse: %s",(bm.fD+bm.sD+bm.tD));
            }
        }
    }//fin method

}//fin class MainBinaryM
