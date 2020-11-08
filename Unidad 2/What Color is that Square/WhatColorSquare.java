
/**
 * Use los comentarios para explicar el objetivo de este programa WhatColorSquare .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (03/11/2020)
 */
public class WhatColorSquare
{
  
  int col, row;
  String color, token;
  char c;
  int d;

   void algoritmo(){ // void algoritmo(char c, int d) "en vez de hacer las variables arriba"

    col = c-'a';
    row = d-1;
    color = (col + row)%2==0? "negro":"blanco";
    token = d==2 || d==7 ? "peón" : (d==1 || d==8) ? "Other" : "vacío";

    if(token.equals("Other"))

      switch(c){
        case 'a': case 'h': token = "torre"; 
        break;
        case 'b': case 'g': token = "caballo"; 
        break;
        case 'c': case 'f': token = "alfil"; 
        break;
        case 'e': token = "rey"; 
        break;
        case 'd': token = "dama"; 
        break;
      }

    }//fin method
    
}//fin class WhatColorSquare
