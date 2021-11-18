package main_com;
import vehiculos.*;
import acciones.*;
public class main_com {
/*
 * se ha usado dos tipos de comando uno para lanzar un proceso y otro para un cambio (activa uno y desactiva otro)
 */
public static void main(String[] args) {
		// TODO Auto-generated method stub
     // broker
	System.out.println("activa Broker");
	   broker brok = new broker();
	
	// coche
   coche coche = new coche();
   System.out.println("comandos coche");
   brok.tomaOrder(coche.arrancar);
   brok.tomaOrder(coche.acelarar);
   brok.tomaOrder(coche.frenar);
   brok.ejecOrder();
 
   //bicicleta
   bicicleta bici = new bicicleta();
   System.out.println("comandos bici");
 //  lanza.ejecuta_lanza (new lanza(test_bici.test_bi_arr));
 //  cambio.ejecuta_cambio (new cambio (test_bici.test_bi_ace,test_bici.test_bi_arr)) ;
   brok.tomaOrder(bici.arrancar);
   brok.tomaOrder(bici.acelerar);
   brok.tomaOrder(bici.frenar);
   brok.ejecOrder();  
   //avion
   avion avi = new avion(); 
   System.out.println("comandos avion");
   brok.tomaOrder(avi.arrancar);
   brok.tomaOrder(avi.acelerar);
   brok.tomaOrder(avi.frenar);
   brok.ejecOrder();  
   //barco
   barco bar = new barco();
   System.out.println("comandos barco");
   brok.tomaOrder(bar.arrancar);
   brok.tomaOrder(bar.acelerar);
   brok.tomaOrder(bar.frenar);
   brok.ejecOrder(); 

	}

}
