
/**
 * Use los comentarios para explicar el objetivo de este programa MainWCS .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (03/11/2020)
 */
import java.util.Scanner;
public class MainWCS{
    public static void main(String args[]){

        WhatColorSquare wc = new WhatColorSquare();

        Scanner sc = new Scanner(System.in);
        
            wc.c = sc.next().charAt(0); 
            wc.d = sc.nextInt();

        wc.algoritmo();//wc.algoritmo(sc.next().charAt(0), sc.nextInt()) "tener scanner al llamar al algoritmo"
        
          if(wc.col>7 || wc.row>7){
            System.out.println("Datos Incorrectos");
            return;
            }

        System.out.printf("Casilla de color %s, por defecto debería contener %s",wc.color,wc.token);

    }//fin method
}//fin class MainWCS
