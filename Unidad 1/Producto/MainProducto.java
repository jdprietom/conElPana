
/**
 * Use los comentarios para explicar el objetivo de este programa MainProducto .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (03/10/2020)
 */
class MainProducto
{
    public static void main(String[] args) {
      

        Producto p = new Producto();

        Consola c = new Consola();

        p.iAmount = c.leerEntero("Cantidad Inicial");
        p.pAmount = c.leerEntero("Cantidad Comprada");
        p.qSold = c.leerEntero("Cantidad Vendida");
        p.pPrice = c.leerEntero("Precio de Compra");


        p.algoritmo();


        c.imprimir("Precio de Venta = " + p.sPrice);
        c.imprimir("Ingresos = " + p.earn);        
        c.imprimir("Egresos = " + p.expe);
        c.imprimir("Ganancias Brutas = " + p.gProfit);
        c.imprimir("Impuestos = " + p.taxes);
        c.imprimir("Ganancias Netas = " + p.netE);

    }    
    }
    
