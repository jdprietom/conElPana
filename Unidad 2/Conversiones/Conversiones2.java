import java.util.Scanner;
import java.math.BigInteger;
public class Conversiones2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger numero, binario, aux, digito, resto;
        int exp;
        int decimal;

        do{ 
            System.out.print("\nIntroduce un numero entero >= 0: \n\n\n");                                                
            numero = new BigInteger(sc.next());
        }while(numero.compareTo(numero.ZERO)<0);

        exp = 0;
        binario = new BigInteger("0");
        aux = numero;
        while(!aux.equals(aux.ZERO)){
            digito = aux.mod(numero.ONE.add(numero.ONE));        
            binario = binario.add(digito.multiply(digito.TEN.pow(exp)));     
            //System.out.println(aux+" / 2 = "+digito+"\tBinario: "+binario);
            exp++;
            aux = aux.divide(aux.ONE.add(aux.ONE));
        }
        System.out.println("Numero Binario -> Decimal: "+numero+", Binario: "+binario);

        //Hexadecimal

        char digitosH[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexadecimal = "";
        exp = 0;
        aux= numero;
        int resto2 = 0;
        while(!aux.equals(aux.ZERO)){
            resto2 = Integer.valueOf(aux.mod(new BigInteger("16")).toString());
            hexadecimal = digitosH[resto2]+hexadecimal;
            //System.out.println(aux+" / 16 = "+resto+"\tHexadecimal: "+hexadecimal);
            aux = aux.divide(new BigInteger("16"));
            exp++; 
        }
        System.out.println("Numero Hexadecimal -> Decimal: "+numero+", Hexadecimal: "+ hexadecimal);


        //Octal

        char digitosO[]={'0','1','2','3','4','5','6','7'};
        BigInteger octal = new BigInteger("0");
        aux = numero;
        exp=0;
        while(!aux.equals(aux.ZERO)){
            resto = aux.mod(new BigInteger("8"));
            octal = octal.add(resto.multiply(octal.TEN.pow(exp)));;
            //System.out.println(aux+" / 8 = "+resto+"\tOctal: "+octal);
            aux = aux.divide(new BigInteger("8")); 
            exp++;
        }
        System.out.printf("%n%nNumero Octal -> Decimal: %d, Octal: %s", numero, octal);
    }
}