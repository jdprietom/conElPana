/**
 * Use los comentarios para explicar el objetivo de este programa MainTienda .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (un numero de version o fecha, por ejemplo 0.01)
 */
class MainTienda
{
    /**Metodo principal (main) ejecutable*/
    public static void main(String [] args)
    {
        //Crear objeto del modelo "M" o negocio
        Tienda t = new Tienda();
        //Crear objeto Vista "V"
        Consola c = new Consola();

        //leer los datos de entrada y entregarlos al modelo, usa la Vista y el Modelo
        t.dineroInicial= c.leerEntero("Dinero Inicial");
        t.totalIngresos= c.leerEntero("Ingresos");
        t.totalEgresos= c.leerEntero("Egresos");

        //invocar el algoritmo o los algoritmos, usando el Modelo
        t.algoritmo();

        //mostrar / imprimir los datos de salida
        c.imprimir("Impuestos = " + t.valorImpuesto);
        c.imprimir("Ganancias Brutas = " + t.gananciasBrutas);        
        c.imprimir("Ganancias Netas = " + t.gananciasNetas);
        c.imprimir("Dinero Final = " + t.dineroFinal);      

    } 
    
}//fin class MainTienda
