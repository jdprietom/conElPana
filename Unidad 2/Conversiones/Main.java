import java.util.Scanner;
public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, exp, digito;
        String binario;
        int resto, aux, decimal;

        do{ 
            System.out.print("\nIntroduce un numero entero >= 0: \n\n\n");                                                
            numero = sc.nextInt();
        }while(numero < 0);

        exp = 0;
        binario = "";
        aux = numero;
        while(aux!=0){
            digito = aux % 2;           
            binario = digito + binario;     
            System.out.println(aux+" / 2 = "+digito+"\tBinario: "+binario);
            exp++;
            aux = aux/2;
        }
        System.out.printf("%nNumero Binario -> Decimal: %d, Binario: %s\n\n\n", numero, binario);

        char digitosH[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexadecimal = "";

        aux= numero;
        while(aux!=0){
            resto = aux % 16;
            hexadecimal = String.valueOf(digitosH[resto]) + hexadecimal;
            System.out.println(aux+" / 16 = "+resto+"\tHexadecimal: "+hexadecimal);
            aux /= 16; 
        }
        System.out.printf("%n%nNumero Hexadecimal -> Decimal: %d, Hexadecimal: %s\n\n\n", numero, hexadecimal);

        char digitosO[]={'0','1','2','3','4','5','6','7'};
        String octal = "";
        decimal = 0;
        aux = numero;

        while(aux!=0){
            resto = aux % 8;
            octal = digitosO[resto] + octal;
            System.out.println(aux+" / 8 = "+resto+"\tOctal: "+octal);
            aux /= 8; 
        }
        System.out.printf("%n%nNumero Octal -> Decimal: %d, Octal: %s", numero, octal);
    }
}