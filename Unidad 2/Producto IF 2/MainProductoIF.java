
/**
 * Use los comentarios para explicar el objetivo de este programa MainProducto .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (26/10/2020)
 */
class MainProductoIF
{
    public static void main(String[] args) {
      

        ProductoIF p = new ProductoIF();

        Consola c = new Consola();

        p.iAmount = c.leerEntero();
        p.pAmount = c.leerEntero();
        p.qSold = c.leerEntero();
        p.pPrice = c.leerEntero();

        p.algoritmo();


        if (p.iAmount<0 || p.pAmount<0 || p.qSold<0 || p.pPrice<00) {

            c.imprimir("Error, los siguientes datos son negativos:");
            
            if(p.iAmount<0){    
                c.imprimir("Cantidad Inicial.");
            }
            if(p.pAmount<0){
                c.imprimir("Cantidad Comprada.");
            }
            if(p.qSold<0){
                c.imprimir("Cantidad Vendida.");
            }
            if(p.pPrice<0){
                c.imprimir("Precio de Compra.");
            }             
        }
        
            else {

            if(p.qSold>p.iAmount){
                c.imprimir("Error, la cantidad vendida supera las existencias.");
            }
            
            else{
                if (p.pAmount>p.qSold){

                    c.imprimir("Precio de Venta: " + p.sPrice);
                    c.imprimir("Ingresos: " + p.earn);        
                    c.imprimir("Egresos: " + p.expe);
                    c.imprimir("Pérdidas Brutas: " + p.gProfit);
                    c.imprimir("Impuestos: " + p.taxes);
                    c.imprimir("Pérdidas Netas: " + p.netE);    
                }

                else{

                    c.imprimir("Precio de Venta: " + p.sPrice);
                    c.imprimir("Ingresos: " + p.earn);        
                    c.imprimir("Egresos: " + p.expe);
                    c.imprimir("Ganancias Brutas: " + p.gProfit);
                    c.imprimir("Impuestos: " + p.taxes);
                    c.imprimir("Ganancias Netas: " + p.netE);
                }
            }          
        }    
    }    
}

            